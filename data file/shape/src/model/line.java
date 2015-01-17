package model;
import java.util.Iterator;
import interfaces.Shape;

public class line implements Shape {
public Point start;
public Point end;
public line(Point start, Point end){	
	this.start = start;
	this.end = end;
}
	@Override
	public Iterator<String> iterator() {
		String[] layers = new String[0];
		LayersIterator li = new LayersIterator(layers);
		return li;
	}

	@Override
	public boolean isBelong(Point po) {//  isBelong = это относится	k modeli nashey
		if(po.getX() >= start.getX()){
			start = po;
		}
		if(po.getX() <= end.getX()){
			end = po;
		}
		
		
		
		
		
		
			return true;
	}

}
