package paula.view;

import paula.model.PersonDatabase;
import paula.model.PersonInfo;

public class PersonsPresentationConsole implements PersonPresentation {
	private PersonDatabase persons;

	public PersonsPresentationConsole(){

	}
	public PersonsPresentationConsole(PersonDatabase persons) {

		this.persons = persons;
	}
	@Override
	public void showPersonInfo(PersonInfo pi) {
		if(pi!=null)
			System.out.println(pi);
		else
			System.out.println("Non pi");

	}

	@Override
	public void showPersons(PersonInfo[] persons) {
		for(int i=0;i<persons.length;i++){
			System.out.println(persons[i]);
		}
	}

	@Override
	public void showPersons() {
		for(PersonInfo pi:persons){
			System.out.println(pi);

		}

	}
}
