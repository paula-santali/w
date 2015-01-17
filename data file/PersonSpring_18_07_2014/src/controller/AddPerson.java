package controller;

import java.sql.SQLException;
import java.util.Arrays;

import model.Person;
import model.PersonInfoModel;

public class AddPerson extends Request{
 
public AddPerson(){
	
}
	
	public String[] runRequest(PersonInfoModel persons) throws SQLException {
		Person prs;
		String[] out=new String[1];
		try{
		prs=new Person(Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]));
		if(persons.addPerson(prs))
			out[0]="Adding Person new is true--->"+Arrays.toString(data);	
		}catch(NumberFormatException e){
			out[0] ="Wrong data-->"+Arrays.toString(data);
			
		}
			
		return out;
	}

	
	}

