package ru.specialist;

public class Program {

	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a ������ ����");
			System.out.println("a > 0");
		}
		else { 
			if (a > -100)
				System.out.println("a ������ -100");
			else
				System.out.println("a �� ������ ����");
		}
		
		int n = 0;
		String s = (n == 0) ? "����" : "�� ����";
		/*String s;
		if (n == 0)
			s = "����";
		else
			s = "�� ����";*/
		
		int x = -1;
		final int p = 1;
		switch(x) {
			case -1:
			case p : 
				System.out.println("����"); 
				break; // return
			case p+1 : System.out.println("���");break; 
			case 3 : System.out.println("���");break;
			 
		}
		
		// �� ����� 5 �����
		
		
			
		
			

	}

}
