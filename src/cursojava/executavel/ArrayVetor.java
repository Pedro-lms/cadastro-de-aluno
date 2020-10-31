package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/* Usado para executar código */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double[] notasJava = {8.8, 9.6, 7.6, 7.8};
		double[] notasEstrutura = { 8.5, 9.0, 6.6, 8.8};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Pedro Machado");
		aluno.setNomeEscola("JDev Treinamento Java");
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notasJava);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Estrutura de Dados");
		disciplina.setNota(notasEstrutura);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//---------------------------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("a nota número: " + (posnota + 1) + " é igual a " + d.getNota()[posnota]);
				}
			} 
		} 
	}
}




/*String[] valores = {"Pedro", "96", "Curso de java da Jdev Treinamento", "contato@jdevtreinamento.com.br"};



for(int pos = 0; pos < valores.length; pos++) {
	System.out.println("O valor " + (pos+1) + " é " + valores[pos]);
}




/* Arrays pode ser todo tipo de dados e objetos */

/*String posicoes = JOptionPane.showInputDialog("Quantas posicoes o array deve ter?");

/* arrays sempre precisam ter a quantidade de posições definidas 
double[] notas = new double[Integer.parseInt(posicoes)];

for(int pos = 0; pos < notas.length; pos++) {
String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + (pos + 1));
notas[pos] = Double.valueOf(valor);
}

for(int pos = 0; pos < notas.length; pos++) {
System.out.println("A nota " + (pos+1) + " é " + notas[pos]);
}*/

/*System.out.println("Nome do aluno = " + aluno.getNome() +"." +  " Inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("----------Disciplina do aluno----------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas das disciplinas são: ");
			
			double notaMax = 0.0;
			double notaMin = 0.0;
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) +" é igual: " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
				
				if(pos == 0) {
					notaMin = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] < notaMin ) {
						notaMin = d.getNota()[pos];
					}
				}
			}
			
			System.out.println("A maior nota da disciplina é: " + d.getDisciplina() + "e de valor: " + notaMax);
			System.out.println("A menor nota da disciplina é: " + d.getDisciplina() + "e de valor: " + notaMin);

		}
	}*/