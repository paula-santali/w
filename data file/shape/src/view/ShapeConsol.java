package view;
import interfaces.Shape;
import interfaces.ShapeCanvas;

public class ShapeConsol implements ShapeCanvas {
	public ShapeConsol(){}
	@Override
	public void draw(Shape shape) {
		for(String draw: shape) {
			System.out.println(draw);

		}
	}
}
