package controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sportsmen.Sportsman;

public class SportAppl {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		Sportsman spotsman=(Sportsman)ctx.getBean("sportsman");
		spotsman.action();
		ctx.close();
		}
}
