package me.thawan.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\nSistema de Estoques");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Excluir Produto");
			System.out.println("3. Alterar Preço");
			System.out.println("4. Alterar Estoque");
			System.out.println("5. Ver Estoque");
			System.out.println("6. Sair");
			int opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do produto: ");
				String nomeProduto = teclado.nextLine();
				System.out.println("Digite o valor do produto: ");
				int precoProduto = teclado.nextInt();
				estoque.cadProd(nomeProduto, precoProduto);
				break;
			case 2:
				System.out.println("Digite o id do produto: ");
				int nProduto = teclado.nextInt();
				estoque.apagarProd(nProduto);
				break;
			case 3:
				System.out.println("Digite o nome do produto: ");
				String noProduto = teclado.nextLine();
				System.out.println("Digite o preço atualizado: ");
				int precoAt = teclado.nextInt();
				break;
			case 4:
				System.out.println("Digite o nome do produto: ");
				String nomeProdu = teclado.nextLine();
				System.out.println("Digite a quantidade de estoque: ");
				int qtdEstoque = teclado.nextInt();
				break;
			case 5:
				estoque.exibirClientes();
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
