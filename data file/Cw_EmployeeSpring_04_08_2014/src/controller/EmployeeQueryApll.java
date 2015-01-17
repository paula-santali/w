package controller;

import org.springframework.context.support.*;

import spring.hibernate.ICLiTest;

public class EmployeeQueryApll {


	public static void main(String[] args) {
		AbstractApplicationContext ctx=
			new FileSystemXmlApplicationContext("beans.xml");
	ICLiTest test= (ICLiTest) ctx.getBean("test");
	String jpaStr;
	while(true){
		jpaStr=test.getJpaString();
		if(jpaStr==null)
			break;
		String []result=test.execute(jpaStr);
		System.out.println("result for "+jpaStr);
		for(String str:result)
			System.out.println(str);
	}
	System.out.println("bye");
}


	}


