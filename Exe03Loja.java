package br.com.generation.exercicios;

public class Exe03Loja {

	private String produtos;
	private int dados;
	
	
    public Exe03Loja(String produtos, int dados) {
		super();
		this.produtos = produtos;
		this.dados = dados;
	}
	
	
	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public int getDados() {
		return dados;
	}
	public void setDados(int dados) {
		this.dados = dados;
	}
	@Override
	public String toString() {
		return "Exe03Loja [produtos=" + produtos + ", dados=" + dados + "]";
	}

	
}
