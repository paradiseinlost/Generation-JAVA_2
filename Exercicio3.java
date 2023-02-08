package Aulajava1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int horas;		
int minutos;
int segundos;
int totalSegundos;


Scanner leia= new Scanner(System.in);

System.out.println("\nQuanto tempo durou o evento em segundos?");
totalSegundos=leia.nextInt();


horas=(totalSegundos/60);
minutos=(totalSegundos%60)/60;
segundos=(totalSegundos%60)%60;

System.out.println("\nO evento tem "+horas+"horas"+minutos+"minutos"+segundos+"segundos:");





		
		
		

	}

}
