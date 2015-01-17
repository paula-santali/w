package interfaces;

import model.Point;

public interface Shape extends Iterable<String>{
	public boolean isBelong(Point point);
}
