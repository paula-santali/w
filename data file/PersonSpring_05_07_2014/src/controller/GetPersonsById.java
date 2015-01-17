package controller;

import java.sql.SQLException;
import java.util.Arrays;

import paula.model.Person;
import paula.model.PersonInfoModel;

public class GetPersonsById extends Request {

	public GetPersonsById(){
		
	}
	
	@Override
	public String[] runRequest(PersonInfoModel persons) throws SQLException {
		Person prs;
		String [] out =new String[1];
		try{
			prs =persons.getPersonId(Integer.parseInt(data[1]));
			out[0]="    Get Person by Id = "+prs.toString();	
		}catch (NumberFormatException e){
			out[0] ="Wrong parametr of Id!!!--->"+Arrays.toString(data);
			
		}
		
		return out;
	}

}
