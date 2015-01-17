package GetMaxandMinValue;

public class ValueTest {
	public static void main(String[] args){
		long Maxvalue=maxValue();
		long Minvalue=MinValue();
		System.out.println("max=  "+Maxvalue);
		System.out.println("min= "+Minvalue);
		long res=power(10);
		System.out.println(res);
	}
	private static long MinValue() {
		long res=1;
		long tmp=1;
		while(tmp>0){
			res=tmp;
			tmp=(tmp*2)+1;
		}
		return res+1;
	}
	private static long power(int i) {
		long  res=1;
		while(i>0){
			res=res*2;
			i--;
		}
		return res;

	}
	private static long maxValue(){
		long res=1;
		long tmp=1;
		while(tmp>0){
			res=tmp;
			tmp=(tmp*2)+1;
		}
		return res;
	}
}
class MaxValueOfLong {
	public static void longe() {
		long res=1;
		long tmp=1;
		while(tmp>0){
			res=tmp;
			tmp++;
		}
		System.out.println(res);
	}
	
}