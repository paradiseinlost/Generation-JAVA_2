package Aulajava1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int anos;
      int meses;
      int dias;
      int idadeEmdias;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("\nDigite a sua idade em anos? ");
      anos=leia.nextInt();
      
      System.out.println("\nAgora digite quantos meses, você tem ?");
      meses=leia.nextInt();
      
      System.out.println("\nAgora digite quantos dias você tem, tirando os anos e os meses ?");
      dias=leia.nextInt();
      
      idadeEmdias=(anos * 365)+(meses*30)+dias;
      
      
      
      System.out.println("\nSua idade em dias é:"+ idadeEmdias);
      
   
      
      
      
      
      
      
      
    
	}

}
