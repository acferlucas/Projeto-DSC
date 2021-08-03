package repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import model.Personal;



@Stateless
public class RepositorioPersonal{
    
    private List<Personal> Personais = new ArrayList<>();
    
    public void create(Personal p) {
    	this.Personais.add(p);
    }
}
