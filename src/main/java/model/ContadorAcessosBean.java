package model;

import java.io.Serializable;

import javax.ejb.Singleton;

@Singleton
public class ContadorAcessosBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	
	public int contadoraluno=1;
	public int contadorpersonal=1;
	public String nomeAluno;
	public String nomePersonal;
	
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomePersonal() {
		return nomePersonal;
	}

	public void setNomePersonal(String nomePersonal) {
		this.nomePersonal = nomePersonal;
	}

	public void incrementarAluno() {
		contadoraluno++;		
	}

	public int contadoratualAluno() {
		
		return contadoraluno;
	}
	
	public void incrementarPersonal() {
		contadorpersonal++;		
	}

	public int contadoratualPersonal() {
		
		return contadorpersonal;
	}

}
