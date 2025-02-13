package me.thawan.controle;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Produto> produtos;
	private int contadorId;
	
	public Estoque() {
		this.produtos = new ArrayList<>();
		this.contadorId = 1;
	}
	
	public void cadProd(String nome, int preco) {
		Produto produto = new Produto(contadorId, nome, preco);
		produtos.add(produto);
		System.out.println("Cliente cadastrado com sucesso!\nID: " + produto.getId() + "\nProduto: " + produto.getName());
		contadorId++;
	}
	
	public void apagarProd(int id) {
	    boolean encontrado = false;
	    for (int i = 0; i < produtos.size(); i++) {
	        Produto produto = produtos.get(i);
	        if (produto.getId() == id) {
	        	produtos.remove(i); 
	            System.out.println("ID: " + id + "\nProduto: " + produto.getName() + " removido com sucesso!");
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("Produto com ID " + id + " não encontrado.");
	    }
	}
	
	public void exibirClientes() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto prod : produtos) {
                System.out.println(prod);
            }
        }
    }
	
}
