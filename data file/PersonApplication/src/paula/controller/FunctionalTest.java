package paula.controller;

import paula.model.PersonDatabase;
import paula.model.PersonInfo;

import paula.view.PersonPresentation;
import paula.view.PersonsPresentationConsole;

public class FunctionalTest {
	private PersonDatabase database;
	private PersonPresentation view;
	private Persons creation;
	public FunctionalTest(PersonDatabase db2,PersonPresentation view,Persons creation){

		this.database=db2;
		this.view=view;
		this.creation=creation;
	}
	public int  test(int nPersons){
		for(int i=0;i<nPersons;i++){
			database.addPerson(creation.createPersonInfo());	
		}
		System.out.println("Create Persons 20&& display persons orded by id");
		this.view = new PersonsPresentationConsole(database);
		view.showPersons();	
		
		System.out.println();
		System.out.println("display persons younger than maxAge/4");
		System.out.println("--------------------------------------------------------------------------");
		database.getPersonsYoungerThan(10);
		view.showPersons();
		
		System.out.println();
		System.out.println("display persons younger than maxAge/2");
		System.out.println("--------------------------------------------------------------------------");
		database.getPersonsYoungerThan(20);
		view.showPersons();
		
		//System.out.println();
		
		//System.out.println("");
		//System.out.println(database.removePerson(12));
		//System.out.println();
		//view.showPersons();
		//System.out.println();
		//database.removePersonsOlderThen(25);
		//view.showPersons();
		
		
		return nPersons;

	}
}
