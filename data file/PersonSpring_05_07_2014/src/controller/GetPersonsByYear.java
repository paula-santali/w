package controller;
import java.util.Arrays;
import java.util.List;
import paula.model.Person;
import paula.model.PersonInfoModel;

public class GetPersonsByYear extends Request {
	public GetPersonsByYear(){
		
	}
	@Override
	public String[] runRequest(PersonInfoModel persons)  {
		String [] out;
		List<Person> res =persons.getPersonsYear(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
		if(res!=null){
		out = new String[res.size()+1];
		out[0]=" Get persons by year in range-->"+data[1]+" "+data[2];
		int i=1;
		for(Person pi:res){
			out[i++]=pi.toString();
		}
		}else
		{
			out =new String[1];
			out[0]="  Wrong input parameters--->"+Arrays.toString(data);
		}
		return out;
	}

}
