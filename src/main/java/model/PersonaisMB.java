
package model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import repositorio.RepositorioPersonal;

@Named
@ViewScoped
public class PersonaisMB implements Serializable{
    
    private List<Personal> personais;
    
    @PostConstruct
    public void init(){
        System.out.println("Iniciando via JSF - ViewScoped");
        this.personais = RepositorioPersonal.getCurrentInstance().readAll();
    }

    public List<Personal> getPersonais() {
        return personais;
    }
    
}
