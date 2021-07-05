
package model;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import repositorio.RepositorioAluno;

@RequestScoped
@Named
public class CadastroAlunoMB implements Serializable{
    
    @EJB
    private Aluno alunobean;
    
    private String codigo;

    public Aluno getAlunobean() {
        return alunobean;
    }

    public void setAlunobean(Aluno alunobean) {
        this.alunobean = alunobean;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void salvar(){
        
        alunobean.setId(Integer.parseInt(codigo));
        RepositorioAluno.getCurrentInstance().create(alunobean);
        System.out.println("Aluno : " +alunobean.getNome() + "Salvo com sucesso");
    }
}
