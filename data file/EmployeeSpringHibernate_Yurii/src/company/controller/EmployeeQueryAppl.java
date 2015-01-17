package company.controller;

import org.springframework.context.support.*;

import spring.hibernate.ICliTest;
import spring.hibernate.JpaDB;

public class EmployeeQueryAppl {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=
				new FileSystemXmlApplicationContext("beans.xml");
		ICliTest test=(ICliTest) ctx.getBean("test");
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
