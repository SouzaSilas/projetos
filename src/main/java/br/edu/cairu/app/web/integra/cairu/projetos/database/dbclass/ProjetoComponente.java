/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author everton
 */
@Entity
@Table(name = "equipe")
public class ProjetoComponente implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer idEquipe;
    private Componente aluno;

    public ProjetoComponente(){
        aluno = new Componente();
    }
    
    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Componente getAluno() {
        return aluno;
    }

    public void setAluno(Componente aluno) {
        this.aluno = aluno;
    }

   

}
