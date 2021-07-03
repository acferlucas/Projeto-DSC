package repositorio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import model.Personal;


@Stateful
public class RepositorioPersonal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static RepositorioPersonal myself = null;
    
    private List<Personal> Personais = null;
    
    
    
    private RepositorioPersonal(){
        this.Personais = new ArrayList<Personal>();
    }
    
    public static RepositorioPersonal getCurrentInstance(){
    	if(myself == null)
            myself = new RepositorioPersonal();
        
        return myself;
    }
    
    public void create(Personal p) {
    	this.Personais.add(p);
    }
    
    public Personal read(int id) {
    	
    	for(Personal paux : this.Personais) {
    		if(paux.getId() == id) {
    			return paux;
    		}
    	}
		return null;
    }
    
    public void update(Personal p ) {
    	
    	for(Personal paux : this.Personais) {
    		if(paux.getId() == p.getId()) {
    			
    			paux.setNome(p.getNome());
    			paux.setNascimento(p.getNascimento());
    			paux.setCidade(p.getCidade());
    			paux.setEmail(p.getEmail());
    			paux.setSenha(p.getSenha());
    			paux.setEndereco(p.getEndereco());
    		}
    	}
    }
    
    public void delete(Personal p) {
    	this.Personais.remove(p);
    }
    
    public List<Personal> readAll(){
    	return this.Personais;
    }
    
}
