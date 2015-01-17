package btnListener_12_Actions;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class btnFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Object placeHolder;

	public Object getPlaceHolder() {
		return placeHolder;
	}
	
	public void setPlaceHolder(Object placeHolder) {
		this.placeHolder = placeHolder;
	}


	public btnFrame(Object placeHolder){
		JTabbedPane t = new JTabbedPane();
		JPanel p;
		JButton b;
		this.setPlaceHolder(placeHolder);// my object for work application

		// panel n1
		p = new JPanel(new FlowLayout());
		getContentPane().add(t);

		b = new JButton("Action 1");
		b.addActionListener(new Action1());
		p.add(b);
		b = new JButton("Action 2");
		b.addActionListener(new Action2());
		p.add(b);
		b = new JButton("Action 3");
		b.addActionListener(new Action3());
		p.add(b);	
		t.addTab("Buttons Layout 1", p);
/**
		// panel n2
		p = new JPanel(new FlowLayout());
		b = new JButton("Action 4");
		//		b.addActionListener(new Action4());
		p.add(b);
		b = new JButton("Action 5");
		//		b.addActionListener(new Action5());
		p.add(b);
		b = new JButton("Action 6");
		//		b.addActionListener(new Action6());
		p.add(b);		
		t.addTab("Buttons Layout 2", p);

		// panel n3
		p = new JPanel(new FlowLayout());
		b = new JButton("Action 7");
		//		b.addActionListener(new Action7());
		p.add(b);
		b = new JButton("Action 8");
		//		b.addActionListener(new Action8());
		p.add(b);	
		b = new JButton("Action 9");
		//		b.addActionListener(new Action9());
		p.add(b);		
		t.addTab("Buttons Layout 3",p);

		// panel n4
		p = new JPanel(new FlowLayout());
		b = new JButton("Action 0");
		//		b.addActionListener(new Action0());
		p.add(b);
		b = new JButton("Action A");
		b.addActionListener(new Action_A());
		p.add(b);
		b = new JButton("Action B");
		//		b.addActionListener(new Action_B());
		p.add(b);		
		t.addTab("Buttons Layout 4", p);
*/
		// creations frame witch buttons and layot 
		setSize(400, 200);
		setLocation(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public static void main(String[]args){
		Object obj = null;
		new btnFrame(obj);
	}
}
