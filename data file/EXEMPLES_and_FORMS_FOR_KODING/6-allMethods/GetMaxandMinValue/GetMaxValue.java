package GetMaxandMinValue;
import java.util.Scanner;
public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String	name=sc.next();
		double result=0;
		if(name.equalsIgnoreCase("byte")){
			result=Byte.MAX_VALUE;
			System.out.println("Max value of "+name+" = "+(int)result);//takoe nazivaetsa kasting daet nam vozmognost videt 4isla a ne beleberdu
		}else if(name.equalsIgnoreCase("int")){
			result=Integer.MAX_VALUE;
			System.out.println("Max value of "+name+" = "+(int)result);
		}else if(name.equalsIgnoreCase("long")){
			result=Long.MAX_VALUE;
			System.out.println("Max value of "+name+" = "+(long)result);
		}else if(name.equalsIgnoreCase("double")){
			result=Double.MAX_VALUE;
			System.out.println("Max value of "+name+" = "+(long)result);
		}else {
			MinValue(name);
		}
	}
	public static void MinValue(String name){
		double result=0;
		if(name.equalsIgnoreCase("-byte")){
			result=Byte.MIN_VALUE;
			System.out.println("Min value of "+name+" = "+result);
		}else if(name.equalsIgnoreCase("-int")){
			result=Integer.MIN_VALUE;
			System.out.println("Min value of "+name+" = "+result);
		}else if(name.equalsIgnoreCase("-long")){
			result=Long.MIN_VALUE;
			System.out.println("Min value of "+name+" = "+result);
		}else if(name.equalsIgnoreCase("-double")){
			result=Double.MIN_VALUE;
			System.out.println("Min value of "+name+" = "+result);
		}else{
			Size(name);
		}
	}
	private static void Size(String name) {
		double result=0;
		if(name.equalsIgnoreCase("size_byte")){
			result=Byte.SIZE;
			System.out.println(name+" = "+result);
		}else if(name.equalsIgnoreCase("size_int")){
			result=Integer.SIZE;
			System.out.println(name+" = "+result);
		}else if(name.equalsIgnoreCase("size_long")){
			result=Long.SIZE;
			System.out.println(name+" = "+result);
		}else if(name.equalsIgnoreCase("size_double")){
			result=Double.SIZE;
			System.out.println(name+" = "+result);
		}
	}
}
