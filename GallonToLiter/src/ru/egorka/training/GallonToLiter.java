package ru.egorka.training;

public class GallonToLiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gallons;
		double liters;
/*		gallons = 10;
		liters = gallons * 3.7854;
		System.out.println(gallons + " �������� ������������� " + liters + " ������");*/
		
		
		System.out.println("������� �������� �������� � �����:");
		int counter = 0;
		for (gallons=0; gallons <100; gallons ++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " �������� ������������� " + liters + " ������");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter=0;
			}
		}
	}
}
