package paula.view;

import paula.model.PersonInfo;


	public interface PersonPresentation {
		public void showPersonInfo(PersonInfo pi);
		public void showPersons(PersonInfo[] persons);
		public void  showPersons();
}
