package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	/*Estes são os atributos dos alunos*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String CPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String SerieMatriculado;
	
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public double getMedia() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoAprovado(){
		double media = this.getMedia();
		if(media > 50) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2(){
		double media = this.getMedia();
		if(media > 50) {
			return "Aluno está aprovado";
		}else {
			return "Aluno está reprovado";
		}
	}
	
	public Aluno() {
		/*Cria os dados da memória- Sendo padrão do Java sempre chamando este construtor, ao chamar o new*/
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	

	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor dos atributos*/
	
	/*Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return SerieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		SerieMatriculado = serieMatriculado;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + 
				", idade=" + idade +
				", dataNascimento=" + dataNascimento +
				", registroGeral="+ registroGeral + 
				", CPF=" + CPF +
				", nomeMae=" + nomeMae +
				", nomePai=" + nomePai + 
				", dataMatricula="+ dataMatricula +
				", nomeEscola=" + nomeEscola +
				", SerieMatriculado=" + SerieMatriculado + 
				 "]";
	} 	 
}

