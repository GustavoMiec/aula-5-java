package br.com.fiap.beans;

public class Cliente {
	
	private String nome;
	private int idade;
	private double rendaMedia;
	private Produto produto;
	
	
	
	
	
	public Cliente() {
		super();
		
		
		
		
	}
	public Cliente(String nome, int idade, double rendaMedia, Produto produto) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rendaMedia = rendaMedia;
		this.produto = produto;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRendaMedia() {
		return rendaMedia;
	}
	public void setRendaMedia(double rendaMedia) {
		this.rendaMedia = rendaMedia;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
