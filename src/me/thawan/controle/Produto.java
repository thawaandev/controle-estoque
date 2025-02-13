package me.thawan.controle;

public class Produto {
	private int id;
	private String nome;
	private int preco;
	
	public Produto(int id, String nome, int preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "[ID: " + id +"]\nProduto: " + nome + "\nPreço: " + preco;
	}
}
