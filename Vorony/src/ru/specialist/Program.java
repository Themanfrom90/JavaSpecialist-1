package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.print("������� ����� �� �����: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Math.sqrt(a)

		String v;
		int n2 = n % 100;

		if ((n2 >= 11) && (n2 <= 14))
			v = "�����";
		else {
			switch (n % 10) {
				case 1:
					v = "������";
					break;
				case 2:
				case 3:
				case 4:
					v = "������";
					break;
				default:
					v = "�����";
			}
		}

		System.out.printf("�� ����� %d %s\n", n, v);

	}

}
