
package control;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.ContadorAcessosBean;
import model.Personal;
import repositorio.RepositorioPersonal;

@RequestScoped
@Named
public class CadastroPersonalMB implements Serializable{
    
     @EJB
    private Personal personalbean;
    
 	@EJB
 	private ContadorAcessosBean contadorAcessosBean;
     
    private int codigo;

    public Personal getPersonalbean() {
        return personalbean;
    }

    public void setPersonalbean(Personal personalbean) {
        this.personalbean = personalbean;
    }
   
    public int getCodigo() {
        return contadorAcessosBean.contadoratualPersonal();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String salvar(){
        
       // personalbean.setId(Integer.parseInt(codigo));
    	personalbean.setId(contadorAcessosBean.contadoratualPersonal());
        RepositorioPersonal.getCurrentInstance().create(personalbean);
        contadorAcessosBean.incrementarPersonal();
        contadorAcessosBean.setNomePersonal(personalbean.getNome());
        System.out.println("Personal : " +personalbean.getNome() + "Salvo com sucesso");
        
        return "personais.xhtml";
    }
}
