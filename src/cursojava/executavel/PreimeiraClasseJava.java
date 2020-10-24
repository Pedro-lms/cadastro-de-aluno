package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PreimeiraClasseJava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Por favor, digite o login");
		String senha = JOptionPane.showInputDialog("Por favor, digite a senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if(permitirAcesso.autenticar()) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*É uma lista que tem uma chave que identifica os uma sequência de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); 
				
		for (int qtd = 1; qtd <= 2; qtd++) {	

		/*new Aluno() é uma instância, criaçãpo de um objeto*/
		/*Aluno 1 é uma referência ao objeto aluno*/
		/*while (true) {*/
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
			/*String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
			String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			String RG = JOptionPane.showInputDialog("Qual o RG?");
			String CPF = JOptionPane.showInputDialog("Qual o CPF?");
			String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae?");
			String nomePai = JOptionPane.showInputDialog("Qual o nome do pai");
			String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula?");
			String SerieMatricula = JOptionPane.showInputDialog("Qual a Série de Matrícula?");
			String nomeIES = JOptionPane.showInputDialog("Qual o nome da Universidade?");*/

			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);	
			aluno1.setRegistroGeral(RG);
			aluno1.setCPF(CPF);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setSerieMatriculado(SerieMatricula);
			aluno1.setNomeEscola(nomeIES);*/
			
			//Integer.valueOf(String n = JOptionPane.showInputDialog("Quantas disciplinas o aluno tem?" + n));
			
			for(int pos = 1; pos <= 5; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina" + pos + "?");
				Disciplina disciplina = new Disciplina();
			
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if(escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0){

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a displina? 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			
			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
			
		System.out.println("----------------------Lista dos alunos aprovados-----------------");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(" Resultado = " + aluno.getNome() + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMedia());
		}
		
		System.out.println("----------------------Lista dos alunos reprovados-----------------");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(" Resultado = " + aluno.getNome() + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMedia());
		}
		
		System.out.println("----------------------Lista dos alunos em recuperação-----------------");		
		for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(" Resultado = " + aluno.getNome() + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMedia());
		}
		
		
			for (int pos = 0; pos < alunos.size(); pos++) {
				Aluno aluno = alunos.get(pos);
				System.out.println("Aluno " + aluno.getNome());
				System.out.println("Média do aluno " + aluno.getMedia());
				System.out.println("Resultado " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------");
				
				for(Disciplina disc: aluno.getDisciplinas()) {
					System.out.println(" Matéria = " + disc.getDisciplina() + " Nota = " + disc.getNota());
				}
			}
			
			for(Aluno aluno: alunos) {
				if(aluno.getNome().equalsIgnoreCase("Fim") || aluno.getNome().equalsIgnoreCase("Acabou")) {
					alunos.remove(aluno);
					break;
				}else {
					System.out.println("A média da nota é: " + aluno.getMedia());
					System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" 
							: "Reprovado"));
					System.out.println("------------------------------------------------------");
				}
			}
		}else {
			JOptionPane.showInputDialog(null, "Acesso Negado");
		}
			
			/*for (Aluno aluno : alunos) {
				System.out.println("Alunos que sobraram na lista");
				System.out.println(aluno.getNome());
				System.out.println("Suas matérias são: ");
			}
			
			for (Disciplina disciplina : aluno1.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
				
			}*/
		}


				
	}
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

