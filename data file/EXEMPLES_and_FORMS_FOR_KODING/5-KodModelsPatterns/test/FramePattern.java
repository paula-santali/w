package test;
import javax.swing.*;
public class FramePattern {
	
	public static void Main(String[]args){
		ShowInformationOnFrame(" name "," text "+" ruru text");
		
	}
	
		public static void ShowInformationOnFrame(String explanations, String text) {
			JFrame frame = new JFrame(explanations);
			frame.setVisible(true);
			frame.setBounds(300, 200, 650, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTextArea ta = new JTextArea();
			ta.append(text);
			JScrollPane sp = new JScrollPane(ta);
			frame.add(sp);
		}
		
}