package br.com.generation.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe03TestaLoja {

public static void main(String[] args) {
		
		Scanner venda = new Scanner(System.in);
		
		ArrayList<Exe03Loja> produtos1 = new ArrayList<>();
		System.out.println("Resultado final do inventário é: ");
		
	    int caixa = venda.nextInt();
	    
	    for(int i=0; i < caixa; i++) {
			System.out.println("Qual o produto: ");
			String produtos = venda.next();
			
			System.out.println("Quantos foram os dados obtidos: ");
		     int dados = venda.nextInt();
		     
		     produtos1.add(new Exe03Loja(produtos ,dados));
	    }	           
	  for(Exe03Loja i : produtos1) {
		  System.out.println(i);
	  }
	   
	}
}