
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "professor")
public class Professor implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer idProf;
    private String mat_professor;
    private int coordenador;
    private String nome_professor;
    private String nome_social;
    private String senha;

    public Integer getIdProf() {
        return idProf;
    }

    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }

    public String getMat_professor() {
        return mat_professor;
    }

    public void setMat_professor(String mat_professor) {
        this.mat_professor = mat_professor;
    }

    public int getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(int coordenador) {
        this.coordenador = coordenador;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
