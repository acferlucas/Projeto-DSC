package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;


@Stateful
public class Aluno extends Pessoa implements Serializable{

	private double altura;
	private double peso;
	private double cintura;
	private double biceps;
	private double coxa;
	private double peitoral;
	private List<Exercicio> exercicios;
	
	public Aluno() {
		this.exercicios = new ArrayList<Exercicio>();
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
	
	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	
	


	
	
}
