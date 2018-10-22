package br.edu.cairu.app.web.integra.cairu.projetos.database.dbclass;

    import java.io.Serializable ;
    import java.util.Objects ;
    import javax.persistence.Entity ;
    import javax.persistence.GeneratedValue ;
    import javax.persistence.Id ;
    import javax.persistence.Table ;

    /**
     *
     * @author Silas Souza
     */
    @Entity
    @Table(name = "curso")
    public class Curso implements Serializable {

        @Id
        @GeneratedValue
        private Integer idCurso;
        private String nome;

        public Integer getIdCurso() {
            return idCurso;
        }

        public void setIdCurso(Integer idCurso) {
            this.idCurso = idCurso;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 17 * hash + Objects.hashCode(this.idCurso);
            hash = 17 * hash + Objects.hashCode(this.nome);
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
            final Curso other = (Curso) obj;
            if (!Objects.equals(this.nome, other.nome)) {
                return false;
            }
            return Objects.equals(this.idCurso, other.idCurso);
        }

    }
