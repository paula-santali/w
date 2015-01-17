package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileRequester implements Requester {
	private static final String DELEMETER = " ";
	BufferedReader input;
	public FileRequester(){};

	public FileRequester(String fileName)  {
		super();
		try {
			this.input = new BufferedReader (new FileReader(fileName));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	@Override
	public Request getRequest(){
		Request req = null;
		String[] data;
		String line;
		if(input != null) {
			try {
				if((line = input.readLine()) != null) {
					data = line.split(DELEMETER);
					req = createClass(data[0]);
					req.data = data;
				}
			} catch (IOException e) {
				System.out.println("Error during reading file");
			}
		}

		return req;
	}


	private Request createClass(String className) {
		Request req =  null;
		try {
			Class<?> cl = Class.forName("controller." + className);
			Object obj = cl.newInstance();
			if(obj instanceof Request) {
				req = (Request) obj;
			}
		} catch (Exception e) {
			req = new WrongRequest();
		} 
		return req;
	}
}



