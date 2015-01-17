package model;

public class Point {
	private int x;
	private int y;
	private char simbol = '*';
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y, char simbol) {
		this.x = x;
		this.y = y;
		this.simbol = simbol;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public char getSimbol() {
		return simbol;
	}
}
