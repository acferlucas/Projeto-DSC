package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

@Stateful
public class Personal extends Pessoa implements Serializable{
	
	private List<Aluno> alunos;
	
	public Personal() {
		
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno a) {
		this.alunos.add(a);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}


