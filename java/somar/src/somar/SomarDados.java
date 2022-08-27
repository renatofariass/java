package somar;

import java.util.Scanner;

public class SomarDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		sc.close();
		float resultado = x + y;
		System.out.printf("a soma entre %.2f e %.2f é %.2f",x, y, resultado, "ISO-8859-1");

	}

}
