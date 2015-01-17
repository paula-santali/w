
public class testApl {

	
	public static void main(String[] args) throws Exception {
		Class cl=Class.forName(args[0]);
		Object obj=cl.newInstance();
		((Sportsman)obj).action();
		//display(obj);

	}

//	public static void display(Object obj) {
//		if(obj instanceof Runner)
//			((Runner)obj).action();
//		else
//			((Footballer)obj).action();
//		
//	}

}
