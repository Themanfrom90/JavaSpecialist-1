package ru.egorka.graph;

public class Point extends Shape {
	private int x,y;
	
	public static final int DEFAULT_X = 2, DEFAULT_Y = 5;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point (int x, int y, String color) {
		super(color);
		setPoint(x,y);
	}
	
	public Point (int x, int y) {
		super(DEFAULT_COLOR);
		setPoint(x,y);
	}
	
	public Point() {
		super(DEFAULT_COLOR);
		setPoint(DEFAULT_X,DEFAULT_Y);
	}
	
	@Override
	public void draw() {
		System.out.println("Это объект типа Point.\n\tЕго координаты ("+this.getX()+"; "+this.getY()+")\n\tЕго цвет - "+super.getColor());
	}
	
	public void moveBy(Point p) {
		setPoint(this.x + p.getX(), this.y + p.getY());
	}
	
	public void moveBy(int x, int y) {
		setPoint(this.x + x, this.y + y);
	}

}
