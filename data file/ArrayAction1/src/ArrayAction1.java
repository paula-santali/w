
public class ArrayAction1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ar[]={2,64,8,3,12,11,10,1,22};
		ArrayAction.printArray(ar);
		System.out.println();
		ArrayAction.printArrayEvens(ar);
		int res;
		res=ArrayAction.minInd(ar);
		System.out.println();
		System.out.print("min="+res);
		System.out.println();
		ArrayAction.reversArray(ar);
		
		
		}

	}


