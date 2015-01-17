package btnListener_12_Actions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class Action1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "NAME OF DIALOG", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);		
		String res = JOptionPane.showInputDialog(null, "NAME OF DIALOG", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
		String ANOTHER_MESSAGE = res;			
		JOptionPane.showMessageDialog(null, ANOTHER_MESSAGE);// print message (text) to frame from java applet		
	}
}
