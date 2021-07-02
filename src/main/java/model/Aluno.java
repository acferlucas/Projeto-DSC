package model;

import repositorio.RepositorioAluno;

public class Aluno extends Pessoa {

	private double altura;
	private double peso;
	private double cintura;
	private double biceps;
	private double coxa;
	private double peitoral;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCintura() {
		return cintura;
	}

	public void setCintura(double cintura) {
		this.cintura = cintura;
	}

	public double getBiceps() {
		return biceps;
	}

	public void setBiceps(double biceps) {
		this.biceps = biceps;
	}

	public double getCoxa() {
		return coxa;
	}

	public void setCoxa(double coxa) {
		this.coxa = coxa;
	}

	public double getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(double peitoral) {
		this.peitoral = peitoral;
	}
	
	public static void main(String[] args) {
		
		Aluno lucas = new Aluno();
		lucas.setId(1);
		lucas.setCidade(null);
		lucas.setNome("lucas");
		lucas.setPeso(67);
		
		Aluno marcel = new Aluno();
		marcel.setId(2);
		marcel.setCidade(null);
		marcel.setNome("Luiz Marcel");
		marcel.setPeso(77);
		
		RepositorioAluno.getCurrentInstance().create(lucas);
		RepositorioAluno.getCurrentInstance().create(marcel);
		System.out.println("------------------Testando readAll------------------");
		for(Aluno aux : RepositorioAluno.getCurrentInstance().readAll()) {
			System.out.println(aux.getNome());
		}
		System.out.println("------------------Testando Delete------------------");
		
		RepositorioAluno.getCurrentInstance().delete(RepositorioAluno.getCurrentInstance().read(2));
		
		for(Aluno aux : RepositorioAluno.getCurrentInstance().readAll()) {
			System.out.println(aux.getNome());
		}
		
		System.out.println("------------------Testando Update------------------");
		Aluno novolucas = RepositorioAluno.getCurrentInstance().read(1);
		novolucas.setNome("lucas Silva");
		
		RepositorioAluno.getCurrentInstance().update(novolucas);
		
		for(Aluno aux : RepositorioAluno.getCurrentInstance().readAll()) {
			System.out.println(aux.getNome());
		}
		
	}
	
	
}
