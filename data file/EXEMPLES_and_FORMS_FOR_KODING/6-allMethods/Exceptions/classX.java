package Exceptions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class classX implements Runnable {
	String strDate;
	public classX(String s){
		this.strDate = s;
	}
	@Override
	public void run(){//Exemple Method
		DateFormat df = new SimpleDateFormat("dd:MM:yyyy");
		Date date = null;
		try {// try action
			date = df.parse(strDate);
			System.out.println("try actions for a drop Exceptions");
			System.out.println(date);
		} 
		catch (ParseException e) {// catch action 
			System.out.println("catch Actions print");
		}
		finally{  //finally action ( obazatelnoe vipolnenie coda)
			System.out.println("final Actions print");
		}	
	}
	
	public static void main(String[] args)  {//action from user
		classX c = new classX("2:5:14");
		c.run();				
	}
}
