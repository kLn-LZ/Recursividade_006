package View;

import Controller.SomaMult;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		
		
		SomaMult SM = new SomaMult();
		
		Scanner scan = new Scanner(System.in);
		
		int valorA;
		int valorB;
		
		System.out.print("Insira o valor que vai ser multiplicado: ");
		
		valorA = scan.nextInt();
		
		System.out.print("Insira o valor que irá multiplicar: ");
		
		valorB = scan.nextInt();
		
		
		System.out.println("Resultado: " + SM.funcSomaMult(valorA, valorB));
		

		
	}
	
}
