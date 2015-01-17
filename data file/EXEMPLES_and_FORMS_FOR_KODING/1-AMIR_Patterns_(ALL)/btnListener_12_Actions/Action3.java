package btnListener_12_Actions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import textArea_string_input.StringOutToTextArea;
public class Action3 implements ActionListener {
	StringOutToTextArea ar = new StringOutToTextArea();// Creations a class StringOutToTextArea(); for print string to Text Area
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "NAME OF DIALOG", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		String res = JOptionPane.showInputDialog(null, "Input word or numbers", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
		String ANOTHER_MESSAGE = res;	
		ar.showString(ANOTHER_MESSAGE);// out text to frame Text Area (input string)	
	}
}
