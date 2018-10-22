package br.edu.cairu.app.web.integra.cairu.projetos.classBean;

import br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass.Componente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Silas Souza
 */
@ManagedBean
public class ComponenteBean {
    
    private Componente componente;
    private List<Componente> componentes;
    
    @PostConstruct
    public void init(){
        componente = new Componente();
        componentes = new ArrayList<>();
    }
    
    public void salvar(){
        if (componente.getMat_aluno().isEmpty()
            ||componente.getNome_aluno().isEmpty()
            ||componente.getNome_social().isEmpty()
            ||componente.getSenha().isEmpty()) {
        }else{
            componentes.add(componente);
            componente = new Componente();
        }
    }
    
    public void atualizar(){}
    public void excluir(){}
    public List<Componente>buscar(){return componentes; }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
}
