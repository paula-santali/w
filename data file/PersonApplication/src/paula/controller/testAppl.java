package paula.controller;

import paula.model.PersonDatabase;

import paula.model.PersonTreeDB;
import paula.view.PersonPresentation;

public class testAppl {


	public static void main(String[] args) {
		PersonDatabase db=new PersonTreeDB();
		Persons pr=new Persons(2,5,5,5,5,5,5);
		PersonPresentation view= null;
		new FunctionalTest(db, view, pr).test(20);
	}

}
