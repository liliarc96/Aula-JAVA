package projeto;

public class Aluno {
	private String serie;
	private String nome;
	private int matricula;
	
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void imprimeDadosAluno(String nome, int matricula, String serie) {
		System.out.println("Aluno: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Série: " + serie);
	}
//ctrl + shift + F
}
