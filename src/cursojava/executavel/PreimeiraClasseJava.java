package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PreimeiraClasseJava {

	public static void main(String[] args) {

		/*new Aluno() é uma instância, criaçãpo de um objeto*/
		/*Aluno 1 é uma referência ao objeto aluno*/
		/*while (true) {*/
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
			String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
			String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			String RG = JOptionPane.showInputDialog("Qual o RG?");
			String CPF = JOptionPane.showInputDialog("Qual o CPF?");
			String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae?");
			String nomePai = JOptionPane.showInputDialog("Qual o nome do pai");
			String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula?");
			String SerieMatricula = JOptionPane.showInputDialog("Qual a Série de Matrícula?");
			String nomeIES = JOptionPane.showInputDialog("Qual o nome da Universidade?");

			
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);	
			aluno1.setRegistroGeral(RG);
			aluno1.setCPF(CPF);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setSerieMatriculado(SerieMatricula);
			aluno1.setNomeEscola(nomeIES);
			
			//Integer.valueOf(String n = JOptionPane.showInputDialog("Quantas disciplinas o aluno tem?" + n));
			
			
			for(int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina" + pos + "?");
				Disciplina disciplina = new Disciplina();
			
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if(escolha == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a displina? 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
			}
				
			
			System.out.println("A média da nota é: " + aluno1.getMedia());
			System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" 
					: "Reprovado"));
			
		/*}*/
		
		/***********************************************************************************************************/
		
		/*Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		/*System.out.println("-----------------------------------------------------------------");
		aluno2.setNome("Pedro");
		aluno2.setIdade(25);
		aluno2.setDataNascimento("10/01/1996");
		
		System.out.println("Nome do aluno 2: é " + aluno2.getNome());
		System.out.println("Idade do aluno é: " + aluno2.getIdade());
		System.out.println("Data de nascimento é: " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		System.out.println("-------------------------------------------------------------");
		
		double soma = 0.0;
		
		for(int i; i < n; i++) {
			soma += [i];
			return soma;
		} 
		
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.toString()); /*Aqui será a descrição do objeto na memória*/
		
		/*Equals e HashCodes (Diferenciar objetos)
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Alex");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}*/
		 
	}

}
