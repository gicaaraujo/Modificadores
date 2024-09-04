package Modificadores;

class Animal {

	private String nome;
	private String cor;
	private String tamanho;
	private String peso;
	private String raca;
	
	protected  String getNome() {
		return nome;
	}
	protected void setNome (String nome) {
		this.nome = nome;
	}
	
	protected String getCor() {
		return cor;
	}
	protected void setCor(String cor) {
		this.cor = cor;
	}
	
	protected String getTamanho() {
		return tamanho;
	}
	protected void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	protected String getPeso() {
		return tamanho;
	}
	protected void SetPeso (String peso) {
		this.peso = peso;
	}
	protected String getRaca() {
		return raca;
	}
	protected void setRaca (String raca) {
		this.raca = raca;
	}}