package controller;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import model.PersonInfoList;
import model.PersonSQL;
import model.PersonInfoMaps;
import model.PersonInfoModel;
import view.PersonInfoConsole;
import view.PersonInfoView;

public class TestApl {

	
	private static final String fileName = "personss";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Requester requester =new FileRequester(fileName);
//		PersonInfoModel person =new PersonInfoMaps();
//		PersonInfoView view =new PersonInfoConsole();
//		
//		PersonTest test =new PersonTest(person,requester,view);
//		test.run();
		
		
		/*PersonInfoModel model = (PersonInfoModel) ctx.getBean("model");
		Requester requester =(Requester) ctx.getBean("requester");
		PersonInfoView view =(PersonInfoView) ctx.getBean("view");
		Runnable test =new PersonTest(model,requester,view);
		test.run();*/
	
		AbstractApplicationContext ctx =new FileSystemXmlApplicationContext("beans.xml");
		Runnable test = (Runnable) ctx.getBean("test");
		test.run();
		Runnable test1 = (Runnable) ctx.getBean("test1");//a doua oara cind sa chemat metoda run
		test1.run();
		ctx.close();
		
	}

}
