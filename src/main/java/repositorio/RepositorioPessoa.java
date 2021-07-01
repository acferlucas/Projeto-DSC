package repositorio;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;


public class RepositorioPessoa {
	private static RepositorioPessoa myself = null;
    
    private List<Pessoa> pessoas = null;
    
    private RepositorioPessoa(){
        this.pessoas = new ArrayList<Pessoa>();
    }
    
    public static RepositorioPessoa getCurrentInstance(){
        if(myself == null)
            myself = new RepositorioPessoa();
        
        return myself;
    }
    
    public void create(Pessoa p ){
        this.pessoas.add(p);
    }
    
    public void update(Pessoa p) {
    	
    	for(Pessoa aux : this.pessoas) {
    		if(aux.getId() == p.getId()) {
    			
    			aux.setNome(p.getNome());
    			aux.setNascimento(p.getNascimento());
    			aux.setCidade(p.getCidade());
    			aux.setEmail(p.getEmail());
    			aux.setSenha(p.getSenha());
    			aux.setEndereco(p.getEndereco());
    		}
    	}
    }
}

