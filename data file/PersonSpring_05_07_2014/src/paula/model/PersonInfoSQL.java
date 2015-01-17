package paula.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import database.DatabaseConnection;

public class PersonInfoSQL implements PersonInfoModel{
	private Statement statement;
	public PersonInfoSQL(String name, String pass, String url) throws ClassNotFoundException, SQLException{
		statement = DatabaseConnection.getDatabaseConnection(url,name,pass);
		String sql ="CREATE TABLE IF NOT EXISTS persondb(id INTEGER,name VARCHAR(254),birthYear INTEGER, PRIMARY KEY(id),INDEX(name),INDEX(birthYear))";
		statement.executeUpdate(sql);	
	}
	public PersonInfoSQL() throws ClassNotFoundException, SQLException{
		statement = DatabaseConnection.getDatabaseConnection("root","12345.com");
		String sql ="CREATE TABLE IF NOT EXISTS persondb(id INTEGER,name VARCHAR(254),birthYear INTEGER, PRIMARY KEY(id),INDEX(name),INDEX(birthYear))";
		statement.executeUpdate(sql);
	}

	
	@Override
	public boolean addPerson(Person person)  {
		boolean result = false;
		int id=person.getId();
		String name=person.getName();
		int year=person.getBirthYear();
		try {
			if(getPersonId(id)==null){
			String sql="INSERT INTO persondb(id,name,birthYear) VALUES ("+id+",'"+name+"',"+year+")";
			statement.executeUpdate(sql);
			result=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Person getPersonId(int id)  {
		Person person =null;
		String sql="SELECT * FROM persondb WHERE id="+id;
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				int id1=rs.getInt("id");
				String nam=rs.getString("name");
				int year=rs.getInt("birthYear");
				person=new Person(id1,nam,year);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public List<Person> getPersonsYear(int minYear, int maxYear)  {
		List<Person> res=new ArrayList<Person>();
		String sql ="SELECT * From persondb WHERE birthYear BETWEEN "+minYear+" AND "+maxYear;
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next() ){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int year= rs.getInt("birthYear");
				res.add(new Person(id,name,year));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public List<Person> getPersonsName(String name) {
		List<Person> res=new ArrayList<Person>();
		String sql="SELECT * FROM persondb WHERE name='"+name+"'"; 
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				int id=rs.getInt("id");
				String name1 =rs.getString("name");
				int year =rs.getInt("birthYear");
				res.add(new Person(id,name1,year));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	@Override
	public boolean removePerson(int id) {
		boolean res =false;
		if(getPersonId(id)==null){
		String sql = "DELETE FROM persondb id ="+id;
		try {
			statement.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		res=true;
		}
	return res;
}
}