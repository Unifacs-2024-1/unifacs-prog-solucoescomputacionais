
/**
 * 
 */

public class Aluno {

  private String nome;
  private int matricula;
  private String curso;
  private int anoIngresso;
  private int qtdeDisciplinas;
  private String situacao;

  // Construtor
  Aluno (String pNome, int pMatricula, String pCurso, int pAnoIngresso, int pQtdeDisciplinas) {
    nome = pNome;
    matricula = pMatricula;
    curso = pCurso;
    anoIngresso = pAnoIngresso;

    if (pQtdeDisciplinas <= 0) {
      qtdeDisciplinas = 0;
      situacao = "Não Matriculado";
    } else {
      qtdeDisciplinas = pQtdeDisciplinas;
      situacao = "Matriculado";
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

  public void setQtdeDisciplinas(int qtdeDisciplinas) {
    this.qtdeDisciplinas = qtdeDisciplinas;
  }

  public int getQtdeDisciplinas() {
    return qtdeDisciplinas;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public String getSituacao() {
    return situacao;
  }

}
