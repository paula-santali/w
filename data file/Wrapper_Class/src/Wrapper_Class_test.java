
public class Wrapper_Class_test {


	public static void main(String[] args) {//functia care scrie valoarea maximala a fiecarui primitiv//
		double res;
		res=getMaxValue("Byte");
		System.out.println("maxValue ->"+ res);
		res=getMaxValue("Short");
		System.out.println("maxValue ->"+ res);
		res=getMaxValue("Int");
		System.out.println("maxValue ->"+ res);
		res=(long)getMaxValue("Long");
		System.out.println("maxValue ->"+ res);
	}
	public static double getMaxValue(String str){
		double res=0;
		if(str.equalsIgnoreCase("Byte")){
			res=Byte.MAX_VALUE;
		}
		else if(str.equalsIgnoreCase("Short")){
			res=Short.MAX_VALUE;
		}
		if(str.equalsIgnoreCase("Int")){
			res=Integer.MAX_VALUE;
		}
		else if(str.equalsIgnoreCase("Long")){
			res=Long.MAX_VALUE;
		}
		else if(str.equalsIgnoreCase("Char")){
			res=Long.MAX_VALUE;
		}
		else if(str.equalsIgnoreCase("Float")){
			res=Float.MAX_VALUE;
		}
		else if(str.equalsIgnoreCase("Double")){
			res=Double.MAX_VALUE;
		}

		return res; 

	}
}


