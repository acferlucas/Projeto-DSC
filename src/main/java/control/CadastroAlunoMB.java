
package control;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import model.ContadorAcessosBean;
import model.Aluno;
import repositorio.RepositorioAluno;

@RequestScoped
@Named
public class CadastroAlunoMB implements Serializable{
    
    @EJB
    private Aluno alunobean;
    
	@EJB
	private ContadorAcessosBean contadorAcessosBean;
    
    private int codigo;
    private String peso;
    private String altura;

    public Aluno getAlunobean() {
        return alunobean;
    }

    public void setAlunobean(Aluno alunobean) {
        this.alunobean = alunobean;
    }

    public int getCodigo() {
        return contadorAcessosBean.contadoratualAluno();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String salvar(){
        
        //alunobean.setId(Integer.parseInt(codigo));
    	alunobean.setId(contadorAcessosBean.contadoratualAluno());
        alunobean.setAltura(Double.parseDouble(altura));
        alunobean.setPeso(Double.parseDouble(peso));
        
        RepositorioAluno.getCurrentInstance().create(alunobean);
        contadorAcessosBean.incrementarAluno();
        contadorAcessosBean.setNomeAluno(alunobean.getNome());
        System.out.println("Aluno : " +alunobean.getNome() + "Salvo com sucesso");
        
        return "alunos.xhtml";
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
}
