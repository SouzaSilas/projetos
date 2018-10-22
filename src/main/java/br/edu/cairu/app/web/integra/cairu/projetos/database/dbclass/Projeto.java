
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer idProj;
    private String nome;
    private String desc_proj;
    private String ano;
    private int validacao_prof;
    private String validacao_coord;
    private int periodo;
    private Disciplina disciplina;
    private ProjetoComponente equipe;    
    private Curso curso;
    private Professor prof;
    private Professor coordenador;

    
    public Projeto() {
        disciplina = new Disciplina();
        equipe = new ProjetoComponente();
        curso = new Curso();
        prof = new Professor();
        coordenador = new Professor();
    }
    
    
    public Integer getIdProj() {
        return idProj;
    }

    public void setIdProj(Integer idProj) {
        this.idProj = idProj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc_proj() {
        return desc_proj;
    }

    public void setDesc_proj(String desc_proj) {
        this.desc_proj = desc_proj;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getValidacao_prof() {
        return validacao_prof;
    }

    public void setValidacao_prof(int validacao_prof) {
        this.validacao_prof = validacao_prof;
    }

    public String getValidacao_coord() {
        return validacao_coord;
    }

    public void setValidacao_coord(String validacao_coord) {
        this.validacao_coord = validacao_coord;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ProjetoComponente getEquipe() {
        return equipe;
    }

    public void setEquipe(ProjetoComponente equipe) {
        this.equipe = equipe;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    
    
}
