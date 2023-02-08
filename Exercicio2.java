package Aulajava1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int anos;
int meses ;
int dias ;
int idadeEmdias;
 

Scanner leia= new Scanner(System.in);

System.out.println("\nQual é a sua idade em Dias ?");
idadeEmdias=leia.nextInt();

anos=(idadeEmdias/365);
meses=(idadeEmdias%365)/30;
dias=(idadeEmdias%365)%30;

System.out.println("\nVocê tem "+anos+"anos :"+meses+"meses:"+dias+"dias:");






		
		
	
		
		
	}

}
