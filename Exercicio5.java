package Aulajava1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float nota1;
	float nota2;
	float nota3;
	float mediaFinal;
	
	Scanner leia= new Scanner (System.in);
	
	System.out.println("\n Entre com a primeira nota : ");
	nota1=leia.nextFloat();
	
	System.out.println("\n Entre com a segunda nota : ");
	nota2=leia.nextFloat();
	
	System.out.println("\nEntre com a terceira nota : ");
	nota3=leia.nextFloat();
	
	mediaFinal=(nota1+2+nota2+3 +nota3+5)/10;
	
	System.out.println("\nSua media final é:  "+mediaFinal);
	
	
	
	
	
	
	
		
		
		
	}

}
