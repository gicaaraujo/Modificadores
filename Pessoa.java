package Modificadores;

public class Pessoa {

	private String nome;
	private int idade;
	private String profissao;
	private Automovel automovel;
	
	
	public void compracarro(String cor, String nome, int velocidade) {
		automovel = new Automovel();
		automovel.setCor(cor);
		automovel.setNome(nome);
		automovel.setVelocidade(velocidade);
	}
	
	public Automovel getAutomovel() {
		return automovel;
	}
	
	public void setAutomovel (Automovel automovel) {
		this.automovel = automovel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}}