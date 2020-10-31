package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	/*Estes são os atributos dos alunos*/
	
	public String DataMatricula;
	public String nomeEscola;
	public String SerieMatriculado;
	
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
			somaNotas += disciplina.getMediaNotas();
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
		}else if(30 <= media &&  media < 50){
			return "Aluno está em recuperação";
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
		return DataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.DataMatricula = dataMatricula;
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
				", dataMatricula="+ DataMatricula +
				", nomeEscola=" + nomeEscola +
				", SerieMatriculado=" + SerieMatriculado + 
				 "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataMatricula == null) ? 0 : DataMatricula.hashCode());
		result = prime * result + ((SerieMatriculado == null) ? 0 : SerieMatriculado.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (DataMatricula == null) {
			if (other.DataMatricula != null)
				return false;
		} else if (!DataMatricula.equals(other.DataMatricula))
			return false;
		if (SerieMatriculado == null) {
			if (other.SerieMatriculado != null)
				return false;
		} else if (!SerieMatriculado.equals(other.SerieMatriculado))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		return true;
	} 
	
	@Override /*Identifica método já existente, sobreescrito*/
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
	
	public String mensagemMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba, aluno é maior de idade" : "Vixe, se saia, demenor";
	}

	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 800;
	}
}

