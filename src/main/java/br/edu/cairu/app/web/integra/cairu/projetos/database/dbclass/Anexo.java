
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "arquivo")
public class Anexo implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer idArquivos;
    private String end_arq;
    private Projeto projeto_cd_proj;

    public Integer getIdArquivos() {
        return idArquivos;
    }

    public void setIdArquivos(Integer idArquivos) {
        this.idArquivos = idArquivos;
    }

    public String getEnd_arq() {
        return end_arq;
    }

    public void setEnd_arq(String end_arq) {
        this.end_arq = end_arq;
    }

    public Projeto getProjeto_cd_proj() {
        return projeto_cd_proj;
    }

    public void setProjeto_cd_proj(Projeto projeto_cd_proj) {
        this.projeto_cd_proj = projeto_cd_proj;
    }
    
    
}
