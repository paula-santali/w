package textArea_string_input;
import java.awt.HeadlessException;
import java.awt.TextArea;

import javax.swing.JFrame;
public class StringOutToTextArea  extends JFrame{
	private static final long serialVersionUID = 1L;
	private  TextArea text;

	public StringOutToTextArea(){
		this.text = new TextArea();
	}
	public void showString(String s){
		println(s);

		setVisible(true);
		add(text);
		pack();
		setResizable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
	}

	public void showObject(Object placeHolder) throws HeadlessException {
		String s;
		MyObjectToString toStr;
		if(placeHolder instanceof String){
			println((String) placeHolder);
		}else{
			toStr = new MyObjectToString();
			toStr.setPlaceHolder(placeHolder); 
			s = toStr.format();
			println(s);
		}
		setVisible(true);
		add(text);
		pack();
		setResizable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
	}

	public synchronized void print(String s){ 
		text.append(s);
	}

	public synchronized  void println(String s){
		text.append(s+"\n");
	}

	class MyObjectToString{
		private Object placeHolder;
		public void setPlaceHolder(Object placeHolder) {
			this.placeHolder = placeHolder;			
		}
		public MyObjectToString(){   }// default constructor

		public String format(){// method to formating another object to string(or string line) @Overede
			String result = null;
			if(placeHolder instanceof Object){// object = my Object
				
				//to do vitch Object placeHolder; from user
				
			}
			return result;	
		}
	}
}
