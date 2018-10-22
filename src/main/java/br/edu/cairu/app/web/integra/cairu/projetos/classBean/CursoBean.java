package br.edu.cairu.app.web.integra.cairu.projetos.classBean;

import br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Silas Souza
 */
@ManagedBean
public class CursoBean {
    private Curso curso;
    private List<Curso> cursos;
    
    @PostConstruct
    public void init(){
        curso = new Curso();
        cursos = new ArrayList<>();
    }
    
    public void salvar(){
        if (curso.getNome().isEmpty()){
        }else{
            cursos.add(curso);
            curso = new Curso();
        }
    }
    
    public void atualizar(){}
    public void excluir(){}
    public List<Curso> buscar(){return cursos;}

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
}
