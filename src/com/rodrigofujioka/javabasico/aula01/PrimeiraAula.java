/**
 * Projeto das trilhas de treinamento de Java b�sico ou avan�ado 
 * com foco nas certifica��es java e em treinamentos corporativos. 
 * Fontes dispon�veis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * 
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula01;

/**
 * Primeiro programa java. Classe de apresenta��o utilizada para entender o
 * ambiente a compila��o de programas com Java.
 * 
 * @author Rodrigo.fujioka
 * @data 03/02/2016 21:30 2018.1 
 * @date 07/02/2019 20:30 2019.1
 *
 */
public class PrimeiraAula {

	/*
	 * main m�todo principal de uma classe executavel java. O compilador java
	 * procura o main m�todo em uma classe para executar, se ela n�o tem esse m�todo
	 * ela n�o � executavel
	 */
	public static void main(String args[]) {
		imprimeNome();
		System.out.println(args[0]);
		System.out.println(args[1]);
	}

	public static void imprimeNome() {
		System.out.println("Al� mundo");
	}

}
