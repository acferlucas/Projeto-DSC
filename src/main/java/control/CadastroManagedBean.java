package control;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import repositorio.RepositorioAluno;
import repositorio.RepositorioPersonal;

@Named("cadastroMB")
@SessionScoped
public class CadastroManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	@EJB
	RepositorioAluno repositorioAluno;
	
	@EJB
	RepositorioPersonal repositorioPersonal;
	*/
	private  String nome;
	private  String nascimento;
	private  String email;
	private  String senha;
	
	
	public void cadastrarPessoa() {
		
		//cadastrar personal ou aluno, mas to com preguiça
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
