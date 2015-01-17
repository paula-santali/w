package controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonTestAppl {


	public static void main(String[] args) {
		AbstractApplicationContext ctx =new FileSystemXmlApplicationContext("beans.xml");

	/*	Runnable test= ((Runnable) ctx.getBean("test"));
		test.run();*/
		((Runnable) ctx.getBean("test")).run();
		ctx.close();
	}

}
