package br.edu.cairu.app.web.integra.cairu.projetos.classBean;

import br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass.ProjetoComponente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Souza
 */
@ManagedBean
public class EquipeBean {
    private ProjetoComponente componente;
    private List<ProjetoComponente> componentes;
    
    @PostConstruct
    public void init(){
        componente = new ProjetoComponente();
        componentes = new ArrayList<>();
    }
    
    public void salvar(){
        if (componente.getAluno().getMat_aluno().isEmpty()
                ||componente.getAluno().getNome_aluno().isEmpty()
                ||componente.getAluno().getNome_social().isEmpty()
                ||componente.getAluno().getSenha().isEmpty()) {
            
            
        }else{
            componentes.add(componente);
            componente = new ProjetoComponente();
        }
    }

    public ProjetoComponente getComponente() {
        return componente;
    }

    public void setComponente(ProjetoComponente componente) {
        this.componente = componente;
    }

    public List<ProjetoComponente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ProjetoComponente> componentes) {
        this.componentes = componentes;
    }
    
    
}
