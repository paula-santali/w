
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class win5 extends Frame implements WindowListener, ActionListener, MouseListener,MouseMotionListener {
	private static final long serialVersionUID = 1L;
	@Override
	public void windowOpened(WindowEvent paramWindowEvent) {}
	@Override
	public void windowClosing(WindowEvent paramWindowEvent) {
		dispose(); System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent paramWindowEvent) {}	
	@Override
	public void windowIconified(WindowEvent paramWindowEvent) {}
	@Override
	public void windowDeiconified(WindowEvent paramWindowEvent) {}
	@Override
	public void windowActivated(WindowEvent paramWindowEvent) {}
	@Override
	public void windowDeactivated(WindowEvent paramWindowEvent) {}
	Color color = Color.BLACK;
	Point p1 = null;
	@Override
	public void mouseClicked(MouseEvent paramMouseEvent) {}
	@Override
	public void mousePressed(MouseEvent paramMouseEvent) {
		p1 = paramMouseEvent.getPoint();
	}
	@Override
	public void mouseReleased(MouseEvent paramMouseEvent) {}
	@Override
	public void mouseEntered(MouseEvent paramMouseEvent) {}
	@Override
	public void mouseExited(MouseEvent paramMouseEvent) {}
	@Override
	public void mouseDragged(MouseEvent paramMouseEvent) {
		Point p2 = paramMouseEvent.getPoint();
		Graphics g = getGraphics();
		g.setColor(color);
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
		p1 = p2;
	}
	@Override
	public void mouseMoved(MouseEvent paramMouseEvent) {}
	void CreateMenu(){
		Menu mColor = new Menu("colors");
		mColor.addActionListener(this);;
		mColor.add(new MenuItem("RED"));
		mColor.add(new MenuItem("GREEN"));
		mColor.add(new MenuItem("BLACK"));
		mColor.add(new MenuItem("WHITE"));
		MenuBar mBar = new MenuBar();
		mBar.add(mColor);
		setMenuBar(mBar);
	}
	@Override
	public void actionPerformed(ActionEvent paramActionEvent) {
		System.out.println("Menu event: "+paramActionEvent);
		String cmd = paramActionEvent.getActionCommand();
		if(cmd.equals("RED")){
			color = Color.RED;
		}else if(cmd.equals("GREEN")){
			color = Color.GREEN;
		}else if(cmd.equals("BLACK")){
			color = Color.BLACK;
		}else if(cmd.equals("WHITE")){
			color = Color.WHITE;
		}		
	}
	public win5(){
		super();
		CreateMenu();
		addWindowListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new win5();
	}
}
