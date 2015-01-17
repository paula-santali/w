package controllerByte;
import java.io.*;
public class InfoStreams {

	public static void main(String[] args) throws Exception {
		String strOut = "This is a text from string reformated in byte array and writed witch method: write(b); ";
		OutputStream out = null;

		InputStream in = null;
		String strIn = null;

		File file = new File("test.txt");// folder on the hard disk by name test

		System.out.println(" Methods of Output Stream writed file to hard disk");
		System.out.println("write 1 ->"+strOut);
		byte[] bufferWrite = null;
		if(file.exists()){
			out = new FileOutputStream(file);// method created file in to hard disk if name of file not faund !!!
			bufferWrite = strOut.getBytes();
			//out.write(bufferWrite);//method added array byte to file on the hard disk	
			//out.write(25);// method added integer to file on the hard disk
			int len = bufferWrite.length;// stop on this step (int)
			int off = 0;// start from this step(int)
			out.write(bufferWrite, off, len);//method added array byte to file on the hard disk	
		}
		out.close();// clouse this stream !!!!
		//----------------------------------------------------------------------------------------------------------------------------------------------------

		System.out.println(" \nMethods of Input Stream readed file to hard disk");
		byte[] bufferRead;
		if(file.exists()){
			in = new FileInputStream(file);
			bufferRead = new byte[in.available()];// created array byte for buffering read from file in to hard disk, length buffer get from class FileInpuStream method buffer = new byte[in.available()]
			//in.read(bufferRead);// reading from file in to this buffer all file
			int off = 0;// from
			int len = 30;// to 
			in.read(bufferRead, off, len);// reading from file in to this buffer "from > to" characters in to the file (int)

			strIn = new String(bufferRead);// formating from byte to string , methods of class string , constractor 
			System.out.println("read 1 ->"+strIn);// print string from file test.txt
		}
		in.close();// clouse this stream !!!!
	}
}
