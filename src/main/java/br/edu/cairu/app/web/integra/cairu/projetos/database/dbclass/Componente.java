
package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;
        
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class Componente implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer idAluno;
    private String mat_aluno;
    private String nome_aluno;
    private String nome_social;
    private String senha;

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getMat_aluno() {
        return mat_aluno;
    }

    public void setMat_aluno(String mat_aluno) {
        this.mat_aluno = mat_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.idAluno);
        hash = 41 * hash + Objects.hashCode(this.mat_aluno);
        hash = 41 * hash + Objects.hashCode(this.nome_aluno);
        hash = 41 * hash + Objects.hashCode(this.nome_social);
        hash = 41 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Componente other = (Componente) obj;
        if (!Objects.equals(this.mat_aluno, other.mat_aluno)) {
            return false;
        }
        if (!Objects.equals(this.nome_aluno, other.nome_aluno)) {
            return false;
        }
        if (!Objects.equals(this.nome_social, other.nome_social)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return Objects.equals(this.idAluno, other.idAluno);
    }
    
}
