
package control;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import model.Aluno;
import repositorio.RepositorioAluno;

@Named
@ViewScoped
public class AlunosMB implements Serializable{
    
    private List<Aluno> alunos;
    
    @PostConstruct
    public void init(){
        System.out.println("Iniciando via JSF - ViewScoped");
        alunos = RepositorioAluno.getCurrentInstance().readAll();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
}
