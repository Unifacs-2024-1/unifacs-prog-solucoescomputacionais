
import java.util.ArrayList;

class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private ArrayList<String> listaDisciplinas;

    // Construtor
    Aluno (String pNome, int pMatricula, String pCurso, int pAnoIngresso) {
        nome = pNome;
        matricula = pMatricula;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        this.listaDisciplinas = new ArrayList<String>();
    }

    public void addDisciplina(String disciplina){
        this.listaDisciplinas.add(disciplina);
        this.setSituacao();
    }

    public void removeDisciplina(int indice) {
        this.listaDisciplinas.remove(indice);
        this.setSituacao();
    }

    public ArrayList<String> getDisciplinas() {
        return this.listaDisciplinas;
    }

    public void setSituacao() {
        if (this.getQtdeDisciplinas() <= 0) {
            this.situacao = "Não Matriculado";
        } else {
            this.situacao = "Matriculado";
        }
    }

    // Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoIngresso() {
		return this.anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

    public String getNome() {
        return nome;
    }

    public int getQtdeDisciplinas() {
        return this.listaDisciplinas.size();
    }

    public String getSituacao() {
        return situacao;
    }
    
}