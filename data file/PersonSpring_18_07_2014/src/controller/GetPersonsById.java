package controller;
import java.sql.SQLException;
import java.util.Arrays;

import model.Person;
import model.PersonInfoModel;

public class GetPersonsById extends Request {

	public GetPersonsById(){
		
	}
	
	public String[] runRequest(PersonInfoModel persons){
		  String []resStr=new String[2];
	        resStr[0]="person with id "+data[1];
	        try {
	            Person person=persons.getPersonId(Integer.parseInt(data[1]));
	             
	            if(person != null){
	                resStr[1]=person.toString();
	            }
	            else
	                resStr[1]="not found person";
	        } catch (NumberFormatException e) {
	            resStr[1]="wrong request data";
	        }
	        return resStr;
	    }
	 

	}



