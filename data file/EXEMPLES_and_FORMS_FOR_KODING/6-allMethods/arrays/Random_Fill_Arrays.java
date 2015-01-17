package arrays;


/*package arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
public class RandomFillArrays {
	private static final int N_ARRAY = 100;
	private static final int N_DATE = 2010;// start from date 
	private static final int N_LENGTHYEARS = 6;
	private static final int N_LENGTHMONTH = 12;
	private static final int N_LENGTHDAYS = 32;
	public static final BugRepOpen bugs[]=new BugRepOpen[N_ARRAY];
	//------------------------------------------------------------
	private static Random rand = new Random();
	private static final Calendar dateOut = new GregorianCalendar();
	public static void main(String[] args) throws Exception { 		 		
		fillbugs(bugs);				
	}
	public static void fillbugs(BugRepOpen[] Array) {
		if(Array != null){
			for(int i=0,count=0;i<N_ARRAY;i++){
				Array[i] = createArray(count);
				count++;
			}
		}
	}
	@SuppressWarnings("unused")
	private static BugRepOpen createArray(int count) {

		String[] sN1 = {"Tel Aviv","Petah Tikva","Bat Yam","Holon","Rehovot","Rishon Lecion","Yavne","Asdod"};
		int sn1=new Random().nextInt(sN1.length);
		//------------------------------------------------------------------------------
		String[] sN2 = {"Balfur","Rotwild","Niczana","Alenbi","Yoseftal","Dov Hoz"};		
		int sn2=new Random().nextInt(sN2.length);
		//------------------------------------------------------------------------------
		String[] sN3 = {"Vasiliy","Andrey","Nikolay","Haim","Amir","Grigoriy","Binyamin"};		
		int sn3=new Random().nextInt(sN3.length);
		//-------------------------------------------------------------------------------
		String sN4 = "Title " + rand.nextInt(N_ARRAY);
		String sN5 = "Test 1 " + rand.nextInt(N_ARRAY);
		//-------------------------------------------------------------------------------
		dateOut.set(N_DATE + rand.nextInt(N_LENGTHYEARS),rand.nextInt(N_LENGTHMONTH),rand.nextInt(N_LENGTHDAYS));
		//-------------------------------------------------------------------------------		
		byte byteOUT1 = (byte)rand.nextInt(3);
		//-------------------------------------------------------------------------------		
		int id = 1000000 + rand.nextInt(9000000);
		int date = 1970 + rand.nextInt(35);
		//--------------------------------------------------------------
		BugRepOpen outArray = new BugRepOpen(sN3[sn3],dateOut.getTime());
		outArray.setTitle(sN4);
		outArray.setSevereness(byteOUT1);
		outArray.setCount(count);
		return outArray;	

	}
	public static void displayBugs(BugRepOpen[] bugs) {
		for(int i=0;i<bugs.length;i++)
			System.out.println(bugs[i]);				
	}
}

готовый класс рандом фил массив
_______________________________________________________________________________________________________
 static class FillArray {			
		// public static final int N_ARRAY = 20;
		// final static Random rand = new Random();	
		public static void fill(Model[] array){
			for(int i = 0;i < array.length;i++)
				array[i] = createAr(array[i]);
		}
		private static Employee createAr(Model array) {
			String [] name = {"moshe","haim","abraham","david","efrat","vasiliy"};
			float salary = 11000+rand.nextInt(99000)+rand.nextFloat();
			int n = rand.nextInt(name.length);
			Model newarr = new Model(salary);
			newarr.setName(name[n]);	
			return newarr;
		}
		}
		_____________________________________________________________________________________________
*/