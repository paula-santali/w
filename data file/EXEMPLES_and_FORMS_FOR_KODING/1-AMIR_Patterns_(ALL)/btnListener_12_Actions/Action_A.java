package btnListener_12_Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Action_A implements ActionListener {
	private static final Object FIRST = "First";
	private static final Object SECOND = "Second";
	private static final Object LAST = "Last";

	@Override
	public void actionPerformed(ActionEvent e) {
		Object[] possibleValues = {FIRST,SECOND,LAST};
		Object ar =  JOptionPane.showInputDialog(null, "Select the desired", "SELECT MESS", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);	
		System.out.println(ar);
	}

}
