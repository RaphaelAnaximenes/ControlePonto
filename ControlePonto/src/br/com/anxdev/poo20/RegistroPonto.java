package br.com.anxdev.poo20;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroPonto{

	


	private long idRegPonto;
	private LocalDate dataRegistro = LocalDate.of(2022, Month.MAY, 06);
	private LocalTime horaEntrada = LocalTime.now();
	private LocalTime horaSaida = LocalTime.of(23, 00);
	
	//Parametros de identação do funcionário 
	List<RegistroPonto> registros = new ArrayList<>();
	protected Funcionario func = new Funcionario(0, "XXX", "XXX", "XXX");
	Date data = new Date();
	
		public Funcionario getFunc() {
		return func;
	}
	public void setFunc(Funcionario func) {
		this.func = func;
	}
	public long getIdRegPonto() {
		return idRegPonto;
	}
	public void setIdRegPonto(long idRegPonto) {
		this.idRegPonto = idRegPonto;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalTime getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public void apresentarRegistroPonto() {
		
		System.out.println("Data de Registro: " + dataRegistro);
		System.out.println("Horário de entrada: " + horaEntrada);
		System.out.println("Horario de saída: " + horaSaida);
		System.out.println(data);
		System.out.println(" -- Ponto batido com sucesso! -- ");
		
	}
	


//	
//	public void listarTrabalhadores() {
//		System.out.println();
//		Consumer<? super Funcionario> consumer =(n) -> System.out.println(n);
//		funcionarios.forEach(consumer);
//	
//	}
	
	
	
}
