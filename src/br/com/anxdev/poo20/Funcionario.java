package br.com.anxdev.poo20;

public class Funcionario{

	protected int idFunc;
	protected String nome;
	protected String email;
	protected String documento;
	
	
	
	
	
	public Funcionario(int idFunc, String nome, String email, String documento) {
		this.idFunc = idFunc;
		this.nome = nome;
		this.email = email;
		this.documento = documento;
	}
	
	
	public int getIdFunc() {
		return idFunc;
	}
	
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}


	
	public String toString() {
		return "Funcionario [idFunc =" + idFunc 
				+ ", nome=" + nome 
				+ ", email=" + email 
				+ ", documento=" + documento + "]";
	}
	
	

	
}
