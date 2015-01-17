package model;
import java.util.Iterator;
import interfaces.Shape;
public class MultiPoints implements Shape {
	private Point[] point;	
	public MultiPoints(Point[] point){
		this.point = point;
		for(int i=0;i<point.length;i++)
			isBelong(point[i]);
	}
	@Override
	public boolean isBelong(Point po) {// isBelong = этa to4ka? относится li ,k nashey	modeli
		line li = new line(po,po);
		if(po.getX() >= li.start.getX()){
			li.start = po;
		}
		if(po.getX() <= li.end.getX()){
			li.end = po;
		}
		return true;	
	}
	@Override
	public Iterator<String> iterator() {
		String[] layers = new String[point.length];
		int x = 0,max = 0;
		for(int i=0;i<point.length;i++){
			max=point[i].getX();
			if(x < max)
				x = max;
		}      
		char[]simbol = new char[x];
		for(int j=0;j<point.length;j++){
			simbol[point[j].getX()] = point[j].getSimbol();
		}
		
		LayersIterator li = new LayersIterator(layers);
		return li;
	}
}
