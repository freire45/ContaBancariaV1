package br.com.erickfreire.contabancaria;

import java.util.Scanner;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		ContaBancaria conta1 = new ContaBancaria();
		
		System.out.printf("Nome Inicial: %s%n%n", conta1.getNome());
		
		System.out.println("Informe o nome do cliente: ");
		nome = entrada.nextLine();
		conta1.setNome(nome);
		System.out.println();
		
		System.out.printf("Nome do Cliente: %s%n%n", conta1.getNome());
		
	}

}
