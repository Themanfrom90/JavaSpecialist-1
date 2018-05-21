package ru.egorka.graph;

public class Shape {
	private String color;
	
	public static final String DEFAULT_COLOR = "����������";
		
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	
	public Shape(String color) {
		setColor(color);
	}
	
	public void draw() {
		System.out.println("��� ������ ������ Shape.\n\t��� ���� - " + this.color);
	}
	
}
