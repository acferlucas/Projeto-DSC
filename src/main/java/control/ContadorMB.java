package control;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.ContadorAcessosBean;


@Named("contadorMB")
@RequestScoped
public class ContadorMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private ContadorAcessosBean contadorAB;
	
	
	
	public String getAlunoNome() {
		return contadorAB.getNomeAluno();
	}
	
	public String getPersonalNome() {
		return contadorAB.getNomePersonal();
	}

	public int getContadorAluno() {
		return contadorAB.contadoratualAluno();
	}


	public int getContadorPersonal() {
		return contadorAB.contadoratualPersonal();
	}

	

	
	
}
