package model;

import java.util.Iterator;
/**
 * каждая форма позволяет итерацию строк слоя. слой содержит точки с тем же значением координатa Y .
 *  точки на строку слоя размещены со смещением равным значением координаты Х
 */
public class LayersIterator implements Iterator<String> {
	private String[] array;
	private int current;	
	LayersIterator(String[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if(current < array.length && array[current] != null)
			return true;
		return false;
	}

	@Override
	public String next() {	
		return array[current++];
	}

	@Override
	public void remove() {}

}
