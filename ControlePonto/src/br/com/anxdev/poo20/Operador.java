package br.com.anxdev.poo20;

public class Operador extends Funcionario{
	
	

	private double valorHora;

	public Operador(int idFunc, String nome, String email, String documento, double valorHora) {
		super(			idFunc,
						nome,
						email,
						documento);
		this.valorHora = valorHora;
	}
	
	
	
	@Override
	public String toString() {
		return "\nOperador :"		+ nome 
				+ "\nValor/hora : "	+ valorHora 
				+ "\nID: "		+ idFunc 
				+ "\nE-mail: "	 	+ email 
				+ "\nDocumento: "	+ documento;
	}

	// Getters e Setters da classe

	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
