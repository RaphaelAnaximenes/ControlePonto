package main_executables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.anxdev.poo20.Funcionario;
import br.com.anxdev.poo20.Gerente;
import br.com.anxdev.poo20.Operador;
import br.com.anxdev.poo20.RegistroPonto;
import br.com.anxdev.poo20.Secretaria;
/*
 * Desenvolvido por Raphael Anaximenes
 *  
 * Versão 1: GerenciarControlePonto.
 * - Executa sistematicamente, sem menu, as solicitações para conclusão do exercício.
 * 
 */
public class GerenciarControlePonto{

public static List<Funcionario> funcs = new ArrayList<>();
public static RegistroPonto rp = new RegistroPonto();
public static void main(String[] args) throws InterruptedException{
	
		
	
	try (Scanner sc = new Scanner(System.in)) {
		int opcao = 1;
		do{				
					System.out.println("Menu Principal");
				    System.out.println("1. Instanciar 1 tipo de cada Funcionários rapidamente com Autopreencher");
				    System.out.println("2. Listar Funcionários registrados");
				    System.out.println("3. Apresentar registros de ponto");
				    System.out.println("0. SAIR");
				    System.out.println("Escolha sua opção: ");
				    

				        	registrarTrabalhadores();

				        	listarTrabalhadores();				        	 

				        	registrosDePonto();

				        	System.out.println("Fim das operações");

				            System.out.println("Desenvolvido por AnxDev");
				            opcao = 0;
				            
				    		      
		}while(opcao != 0);
	}finally{
		System.out.println("Finalizando App");
		
	}
	
	
}

// MÉTODOS DO MAIN
public static void registrarTrabalhadores() {
	Funcionario g1 = new Gerente(10, "Carlos Roberto", "carlosrobs@gmail.com", "400.028.922-G", "carlosroberto", "carlosrobs");
	Funcionario o1 = new Operador(20, "Josue Operador", "Josueoperador@hotmail.com", "408.588.755-O", 2.55);
	Funcionario s1 = new Secretaria(30, "Secretario Romualdo", "secretariororo@yahoo.com", "444.555.666-S", "19 9558-8944", "31");
	Funcionario s2 = new Secretaria(40, "Secretaria Romualda", "secretariorara@yahoo.com", "444.555.666-S", "19 9558-8944", "25");
//	Funcionario <s,o,g> = new Secretaria(n, "xx xx", "x@x.x", "n.n.n-[inicial da classe]", "19 9999-9999", "xx");

	// Data Set ArrayList - "BD"
	funcs.add(g1);
	funcs.add(o1);
	funcs.add(s1);
	funcs.add(s2);
	System.out.println("\n [Incluidos com sucesso ] \n");
	}


public static void listarTrabalhadores(){
	
	if(funcs.isEmpty()) {
		System.out.println("|| Não há trabalhadores registrados, registre na função 1|| \n");
	}
	else { 
		
	System.out.println(" --- Trabalahadores já listados ---");
	funcs.forEach((n) -> {
		try {
			Thread.sleep(1000); // Controle o tempo aqui :) "Como se o Sr. não soubesse"
			System.out.println("\n[Tipo já incluído]:" + n + "\n ");
			
		} catch (InterruptedException e) {
			e.getMessage();
		}});}
	System.out.println("-- FIM DA LISTA --");
}

public static void registrosDePonto() {
	
	
	
	if(funcs.isEmpty()) {
		System.out.println("|| Não há trabalhadores registrados, registre-os na função 1|| \n");
	}
	else { 
		
	System.out.println(" --- PONTO DE TODOS OS FUNCIONARIOS REGISTRADOS  ---");
	
	funcs.forEach((f) -> {
		try {
			Thread.sleep(1000); // Controle o tempo aqui :) "Como se o Sr. não soubesse"
	System.out.println(
	"Funcionario: \n" + f.getIdFunc()
	+ " - "+ f.getNome() 
	+ " - Documento: " + f.getDocumento()
	+ "\nClasse do Objeto:" + f.getClass()
	+ "\n\n"
	) ;
	rp.apresentarRegistroPonto();
	
	System.out.println("\n==========");
		} catch (InterruptedException e) {
			e.getMessage();
		}});}
	System.out.println("-- FIM DA LISTA --");
	
}}
