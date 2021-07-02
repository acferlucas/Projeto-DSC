package model;

import java.util.ArrayList;
import java.util.List;

import repositorio.RepositorioPersonal;

public class Personal extends Pessoa{
	
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
		
		Personal personal = new Personal();
		personal.setId(3);
		personal.setNome("julio");
		personal.setCidade("Recife");
		personal.alunos.add(marcel);
		personal.alunos.add(lucas);
				
		RepositorioPersonal.getCurrentInstance().create(personal);
		System.out.println("Testador Repositorio Peronais : ");
		System.out.println(RepositorioPersonal.getCurrentInstance().read(3).getAlunos().size());
		
		
		
	}
}


