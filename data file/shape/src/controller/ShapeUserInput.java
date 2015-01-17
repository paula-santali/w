package controller;

import model.Point;
import interfaces.Shape;
import interfaces.ShapeCanvas;

public class ShapeUserInput implements Runnable {
	private Shape shape;
	private ShapeCanvas canvas;
	private Point point;

	public ShapeUserInput(Shape shape, ShapeCanvas canvas, Point point) {
		this.shape = shape;
		this.canvas = canvas;
		this.point = point;
	}

	public ShapeUserInput(){}

	@Override
	public void run() {
		Point[]point = new Point[1000];
		for(int i=0;i<point.length;i++)
			point[i] = fill();
		for(int i=0;i<point.length;i++)
		
		canvas.draw(shape);
	}

	private static Point fill() { 
		int x = (int)(Math.random()*50);
		int y = (int)(Math.random()*20);
		Point pAll = new Point(x, y);
		return pAll;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void setCanvas(ShapeCanvas canvas) {
		this.canvas = canvas;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
