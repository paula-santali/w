package controllerByte;
import java.io.*;
/**  Step-1 
	 Application converts string to byte code and stores it on the hard disk, file type: NAME.txt. 
	 Step-2 
	 Application reads the file from the hard disk and converts byte code string. 
	 Step-3 
	 Application converts string into an array of strings witch method: String str.split ("");  !!! separator space to take! 
	 Step-4 
	 Application converts an array of strings to the int witch method: int res = Integer.parseInt (strings [i]); 
	 Step-5 
	 Application returns the sum of the numbers in the file    **/

public class testAppl_for_File_out_in_putsStream {

	static class creatAndFillOutputFile {	 	
		private static final double maxVal = 100;
		private static final double minVal = 50;
		private static final int max = 100;
		private static final int min = 0;
		private static final String separator = " ";
		private OutputStream out;
		private String str;
		private File file;

		public creatAndFillOutputFile() throws Exception{	// constructor vitch parameters
			createStringRandom();
			this.file = new File("test.txt");
			if(file.exists())
				file.createNewFile();
			this.out = new FileOutputStream(file);
			byte[]b = this.str.getBytes();
			out.write(b);
			out.close();
		}

		void createStringRandom(){
			StringBuffer tmpStr = new StringBuffer();
			int nByte = (int)(Math.random()*(max-min)+min);
			for(int i = 0;i<nByte;i++){
				int s = (int)(Math.random()*(maxVal-minVal)+minVal);
				tmpStr.append(s+separator);			
			}
			this.str = tmpStr.toString();//string buffer to string
		}
	}

	static class getSumOfNumbersInToInputFile {
		private InputStream in;
		private String str;
		private int res = 0;
		private File f;
		public getSumOfNumbersInToInputFile() throws Exception{// constructor vitch parameters
			this.f = new File("test.txt");
			f.getAbsoluteFile();
			if(f.exists()){
				this.in = new FileInputStream(f);
				byte[] b = new byte[in.available()];
				in.read(b);
				this.str = new String(b);
				str = new String(str);
				summString(str);
			}
		}

		private void summString(String str) {
			String[] strings = str.split(creatAndFillOutputFile.separator);
			for(int i=0;i < strings.length;i++){
				res += Integer.parseInt(strings[i]);// summing numbers 
			} 
		}

		public int getSummOfNumbers(){
			return res;
		}

		public String getNumbersFromInputFile() {
			return this.str;
		}
	}

	public static void main(String[] args) throws Exception {
		int resForPrint;
		new creatAndFillOutputFile();

		getSumOfNumbersInToInputFile get = new getSumOfNumbersInToInputFile();
		resForPrint = get.getSummOfNumbers();
		System.out.println("numbers\n"+get.getNumbersFromInputFile());
		System.out.println("sum of numbers\n"+resForPrint);
	}


}

