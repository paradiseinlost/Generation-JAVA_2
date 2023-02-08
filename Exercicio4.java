package Aulajava1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a;	
	int b;
	int c;
	int d;
	int r;
	int s;
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.print("\n Digite o primeiro numero inteiro? ");
	    a=leia.nextInt();

System.out.print("\n Digite o segundo numero inteiro? ");
	    b=leia.nextInt();


System.out.print("\n Digite o terceiro numero inteiro? ");
	  c=leia.nextInt();
 
		r= (int) Math.pow(a+b,2);
		s=(int)Math.pow(b+c,2);
		d=(r+s)/2;
		
		System.out.println("\nO resultado do numero é:"+d);
		
		
		
		
		
		

	}

}
