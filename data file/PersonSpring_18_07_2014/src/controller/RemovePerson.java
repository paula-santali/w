package controller;
import java.sql.SQLException;
import java.util.Arrays;
import model.Person;
import model.PersonInfoModel;


public class RemovePerson extends Request {

public RemovePerson(){
	
}
	
	@Override
	public String[] runRequest(PersonInfoModel persons) {
		Person prs = null;
		String [] out =new String[1];
		try{
			prs =persons.getPersonId(Integer.parseInt(data[1]));
			if(persons.removePerson(Integer.parseInt(data[1]))){
			out[0]="  Remove person-->"+prs.toString();
}
		}catch (NumberFormatException e){
			out[0]="Wrong parameter for removing-->"+Arrays.toString(data);
		}
		
		return out;
	}

}
