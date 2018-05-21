package ru.egorka.graph;

public class Circle extends Shape{
	private int x,y;
	private double r;
	
	public static final double DEFAULT_R = 3;
	public static final int DEFAULT_X = 3;
	public static final int DEFAULT_Y = 3;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public double getR() {
		return this.r;
	}
	
	public void setCenterPoint(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public void setCenterPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public Circle (int x, int y, double r, String color) {
		super(color);
		setCenterPoint(x,y);
		setR(r);		
	}
	
	public Circle (double r) {
		this(DEFAULT_X, DEFAULT_Y,r,DEFAULT_COLOR);		
	}
	
	public Circle() {
		this(DEFAULT_X, DEFAULT_Y);
	}
	
	public Circle(Point p) {
		this(p.getX(), p.getY());
	}
	
	public Circle(int x, int y) {
		this(x,y,DEFAULT_R,DEFAULT_COLOR);
	}
	
	public Circle(int x, int y, double r) {
		this(x,y,r,DEFAULT_COLOR);
	}
	
	@Override
	public void draw() {
		System.out.println("Это объект класса Circle.\n\tЕго центр расположен по координатам ("+getX()+", "+getY()+")\n\tЕго радиус = "+getR()+
				"\n\tЕго цвет - "+this.getColor());
	}
	
	public void scale(double r) {
		this.setR(r);
	}
	
	public double getSquare() {
		return Math.PI * Math.pow(this.r, 2);
	}

}
