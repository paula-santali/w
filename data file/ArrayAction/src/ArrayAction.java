
public class ArrayAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ar[]={22,1,3,2,56,4,23,35,8,9};
ArrayAct.printArray(ar);
int res;
res=ArrayAct.minInt(ar);
System.out.println("\nMin="+res);
ArrayAct.printArrayEvens(ar);
System.out.println();
ArrayAct.reversArray(ar);

	}

}
