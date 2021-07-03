package repositorio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import model.Aluno;


@Stateful
public class RepositorioAluno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static RepositorioAluno myself = null;
    
    private List<Aluno> alunos = null; 
    
    private RepositorioAluno(){
        this.alunos = new ArrayList<Aluno>();
    }
    
    public static RepositorioAluno getCurrentInstance(){
        if(myself == null)
            myself = new RepositorioAluno();
        
        return myself;
    }
    
    public void create(Aluno a ){
        this.alunos.add(a);
    }
    
    public void update(Aluno a) {
    	
    	for(Aluno aux : this.alunos) {
    		if(aux.getId() == a.getId()) {
    			
    			aux.setNome(a.getNome());
    			aux.setNascimento(a.getNascimento());
    			aux.setCidade(a.getCidade());
    			aux.setEmail(a.getEmail());
    			aux.setSenha(a.getSenha());
    			aux.setEndereco(a.getEndereco());
    		}
    	}
    }
    
    public Aluno read(int id) {
    	for(Aluno aux : this.alunos) {
    		if(aux.getId() == id) {
    			return aux;
    		}
    	}
    	return null;
    }
    
    public void delete(Aluno a) {
    	this.alunos.remove(a);
    }
    
    public List<Aluno> readAll(){
    	return this.alunos;
    }
}
