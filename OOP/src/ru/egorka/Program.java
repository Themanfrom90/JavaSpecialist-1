package ru.egorka;

import ru.egorka.graph.*;

public class Program {
	public static void main(String args[]) {
		System.out.println("Добро пожаловать в программу отрисовки фигур!\n");
		Shape s1 = new Shape();
		Shape s2 = new Shape("Фиолетовый");
		s1.draw();
		s2.draw();
		
		Point p1 = new Point();
		Point p2 = new Point(4,7);
		Point p3 = new Point(0,0,"Привет, Лаша!");
		Point p4 = new Point(-3,-5,"Черненький");
		
		p1.draw();
		p2.draw();
		p3.draw();
		
		p1.moveBy(p2);
		p1.draw();
		
		p3.moveBy(p4);
		p3.draw();
		
		p3.moveBy(5, 15);
		p3.draw();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3,4);
		Circle c3 = new Circle(5,6,7.4);
		Circle c4 = new Circle(3,4,5,"Бред какой-то!");
		Circle c5 = new Circle(4.5d);
		
		c1.draw();
		c2.draw();
		c3.draw();
		c4.draw();
		c5.draw();
		
		c1.setCenterPoint(p2);
		c1.draw();
		
		
		
		
	}
}
