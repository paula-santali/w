package controller;



import java.sql.SQLException;

import paula.model.PersonInfoModel;
import paula.view.PersonInfoView;

public class PersonTest implements Runnable {
private PersonInfoModel persons;
private Requester requester;
private PersonInfoView view;

	@Override
	public void run() {
		String [] result = null;
		Request request;
	while((request=requester.getRequest())!=null){
		try {
			result=request.runRequest(persons);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		view.show(result);
	}
		
	}
	public PersonTest(PersonInfoModel persons, Requester requester,
			PersonInfoView view) {
		super();
		this.persons = persons;
		this.requester = requester;
		this.view = view;
	}

}
