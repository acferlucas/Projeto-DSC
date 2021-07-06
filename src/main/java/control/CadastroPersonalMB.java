
package control;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import model.Personal;
import repositorio.RepositorioPersonal;

@RequestScoped
@Named
public class CadastroPersonalMB implements Serializable{
    
     @EJB
    private Personal personalbean;
    
    private String codigo;

    public Personal getPersonalbean() {
        return personalbean;
    }

    public void setPersonalbean(Personal personalbean) {
        this.personalbean = personalbean;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String salvar(){
        
        personalbean.setId(Integer.parseInt(codigo));
        RepositorioPersonal.getCurrentInstance().create(personalbean);
        System.out.println("Personal : " +personalbean.getNome() + "Salvo com sucesso");
        
        return "personais.xhtml";
    }
}
