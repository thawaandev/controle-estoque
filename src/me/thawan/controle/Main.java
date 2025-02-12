package me.thawan.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\nSistema de Estoques");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Apagar Produto");
			System.out.println("3. Alterar Preço");
			System.out.println("4. Alterar Estoque");
			System.out.println("5. Procurar Mercadoria");
			System.out.println("6. Sair");
			int opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do produto: ");
				String nomeProduto = teclado.nextLine();
				System.out.println("Digite o valor do produto: ");
				int precoProduto = teclado.nextInt();
				estoque.cadProdutos(nomeProduto, precoProduto);
				System.out.println("Produto cadastrado com sucesso...");
				System.out.println("Produto: " + nomeProduto + "\nPreço: " + precoProduto);
				break;
			case 5:
				estoque.consultarProdutos();
				break;
			case 6:
				System.out.println("Saindo...");
				teclado.close();
				return;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}

	}

}
