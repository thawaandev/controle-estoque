package me.thawan.controle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Estoque {
	private Map<String, Integer> produto = new HashMap<String, Integer>();
	Scanner teclado = new Scanner(System.in);
	private int saldo;
	private int quantidade;
	private int id = 0;
	
	public void cadProdutos(String nome, int preco) {
		this.produto.put(nome, preco);
		this.saldo = preco;
		this.quantidade = 0;
		this.id = id += 1;
	}
	
	public void apagarProdutos(String nome) {
		if(!produto.containsKey(nome)) {
			System.out.println("Produto não encontrado.");
		} else {
			this.produto.remove(nome);
			System.out.println("Produto: " + nome + " excluido com sucesso!");
		}
	}
	
	public void altPreco(String prod, int preco) {
		if(!produto.containsKey(prod)) {
			System.out.println("Produto não encontrado!");
		} else {
			produto.replace(prod, preco);
			System.out.println("Atualização:\nProduto: " + prod + "\nPreço: " + preco);
		}
	}
	
	public void altQuantidade(String nome, int qtd) {
		if(!produto.containsKey(nome)) {
			System.out.println("Produto não encontrado");
		} else {
			if(qtd > 0) {
				quantidade += qtd;
				System.out.println("Estoque Alterado\nProduto: " + nome +"\nEstoque: " + qtd);
			}
		}
	}
	
	
	
	
	public void consultarProdutos() {
		if(produto.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			Set<Entry<String, Integer>> c1 = produto.entrySet();
			for(Entry<String, Integer> n1 : c1) {
				System.out.println("Produto: " + produto.keySet());
				System.out.println("Preço: " + produto.values());
				System.out.println("Quantidade: " + quantidade);
			}
		}
	}
	@Override
	public String toString() {
		return this.produto.toString();
	}
}
