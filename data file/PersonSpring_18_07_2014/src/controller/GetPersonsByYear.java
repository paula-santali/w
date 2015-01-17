package controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import model.Person;
import model.PersonInfoModel;

public class GetPersonsByYear extends Request {
	public GetPersonsByYear(){
		
	}
	@Override
	public String[] runRequest(PersonInfoModel persons) {
		 String[]resStr=new String[0];
	        try {
	            List<Person> list=persons.getPersonsYear(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
	            resStr=new String[list.size()+1];
	            resStr[0]="persons born in the years from "+data[1]+" to "+data[2];
	            int index=1;
	            for(Person person: list){
	                resStr[index++]=person.toString();
	            }
	        } catch (NumberFormatException e) {
	             
	        }
	        return resStr;

	}

}
