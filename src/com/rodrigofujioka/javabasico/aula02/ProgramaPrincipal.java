package com.rodrigofujioka.javabasico.aula02;

import java.util.Scanner;

/**
 * Classe criada para demonstrar como � realizada a cria��o 
 * de objetos a partir de outras classes.
 * 
 * @author Rodrigo.fujioka
 * 
 * @data 04/02/2016  21:33 
 *
 */
public class ProgramaPrincipal {
		
	public static void main(String[] args) {
		
	/*
	 * Esse objeto realiza a leitura dos dados
	 * enviados para o teclado. Ao ser invocado
	 * fica aguardando a entrada de dados.
	 *  
	 */
	Scanner leitor = new Scanner(System.in);	
	
	
	/*
	 * Criando algo na mem�ria do Java.
	 * Agora a classe que voc� criou existe e pode ter 
	 * seu comportamento invocado.
	 * x � o nome da variav�l que aponta para o objeto em mem�ria.
	 */
	RodrigoFujioka x = new RodrigoFujioka();
    x.imprimeNome();
    x.imprimeIdade();
    
    /**
     * Variav�l do tipo String, que recebe textos.
     */
    String nomeProfessor;
    
    
    System.out.println("Informe o seu nome:");
    // Ap�s a exibi��o do texto fica aguardando a digita��o dedos
    nomeProfessor = leitor.nextLine();
    
    //Exibe as informa��es digitadas no console para o usu�rio.
    System.out.println("Nome " + nomeProfessor);
    
		
	}
	
	

}
