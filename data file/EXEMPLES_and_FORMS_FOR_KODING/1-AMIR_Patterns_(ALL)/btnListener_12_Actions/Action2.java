package btnListener_12_Actions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
public class Action2 implements ActionListener {
	private static final Object FIRST = "First";
	private static final Object SECOND = "Second";
	private static final Object LAST = "Last";

	@Override
	public void actionPerformed(ActionEvent e) {
		Object[] possibleValues = {FIRST,SECOND,LAST};
		Object ar =  JOptionPane.showInputDialog(null, "Select the desired", "SELECT MESS", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);	
		Object ANOTHER_MESSAGE = ar;
		JOptionPane.showMessageDialog(null, ANOTHER_MESSAGE);
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {	
		JOptionPane.showMessageDialog(null, "NAME OF DIALOG", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);	
		String res = JOptionPane.showInputDialog(null, "NAME OF DIALOG", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);				
	}*/
}
