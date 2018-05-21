package ru.specialist;

public class Program {

	public static void main(String[] args) {
		byte n = -128;
		//new String()
		char [] bits = new char [8];
		for(int i=bits.length-1;i >= 0; i--)
	{
		bits[i] =	(n & 1)==1 ? '1' : '0';
		//n = n >>> 1;
		n >>>=1;
		}
	String bt = new String(bits);
	System.out.println(bt);
	}

}
