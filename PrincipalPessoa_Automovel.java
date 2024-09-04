package Modificadores;

import java.util.Scanner;

public class PrincipalPessoa_Automovel {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		//CRIA O OBJETO PESSOA
		Pessoa pessoa = new Pessoa();

		String cor, nome;
		int velocidade;


		System.out.println("Informe a cor do carro:");
		cor = ler.next();

		System.out.println("Informe o nome do carro:");
		nome = ler.next();

		System.out.println("Informe a velocidade do carro:");
		velocidade = ler.nextInt();


		//UTILIZA O MÉTODO COMPRACARRO
		pessoa.compracarro(cor, nome, velocidade);

		//UTILIZADO PARA MOSTRAR O RETORNO DO CARRO COMPRADO
		Automovel carro = pessoa.getAutomovel();

		System.out.println("O carro comprado foi " + carro.getNome() + " da cor " + carro.getCor() + "que atinge a velocidade " + carro.getVelocidade());

		ler.close();
	}}