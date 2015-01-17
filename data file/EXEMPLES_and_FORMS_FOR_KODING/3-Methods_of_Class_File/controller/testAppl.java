package controller;
import java.io.*;

public class testAppl {

	public static void main(String[] args) throws Exception {
	File f = new File("holderPlays.txt");
	if(f.exists()){
		f.createNewFile();
	}

	}

}
