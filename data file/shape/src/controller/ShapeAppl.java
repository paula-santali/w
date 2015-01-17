package controller;
import interfaces.Shape;
import interfaces.ShapeCanvas;

import javax.sound.sampled.Line;

import model.MultiPoints;
import model.Point;
import model.line;
import view.ShapeConsol;
public class ShapeAppl {
	public static void main(String[] args) {
		Point[]point = new Point[100];
		for(int i=0;i<point.length;i++)
			point[i] = fill();		
		Shape shape = new MultiPoints(point);
		ShapeCanvas canvas = new ShapeConsol();	
		canvas.draw(shape);		
		
	/*	ShapeUserInput sUp = new ShapeUserInput();
		sUp.setCanvas(canvas);
		sUp.setShape(shape);
	sUp.run();*/
		
	}

	private static Point fill() { 
		int y=0,k=3,x=0;		
		x = (int)(Math.random()*31);
		y = k*x;
		Point pAll = new Point(x, y);
		return pAll;
	}

}
