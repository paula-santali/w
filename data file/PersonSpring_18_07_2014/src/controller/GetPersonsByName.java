package controller;

import java.sql.SQLException;
import java.util.List;

import model.Person;
import model.PersonInfoModel;

public class GetPersonsByName extends Request {

	public GetPersonsByName(){
		
	}
	
	
	@Override
	public String[] runRequest(PersonInfoModel persons) throws SQLException {
		
		String []out;
		List<Person >res =persons.getPersonsName(data[1]);
		if(res!=null){
			out =new String[res.size()+1];
			out[0] ="  Get Person By Name--->"+data[1];
			int i=1;
			for(Person pi:res){
				out [i++]=pi.toString();
			}
		}else
		{
			out = new String [1];
			out[0]=" Person by this name--->"+data[1]+",is not avalable!!!";
			
		}
			
		return out;
	}

}
