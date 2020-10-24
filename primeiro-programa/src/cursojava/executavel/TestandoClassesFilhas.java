package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Pedro");
		aluno.setIdade(24);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("Registro de teste");
		diretor.setNome("Varoto");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNome("Jo�ozinho");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.mensagemMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno � igual: " + aluno.Salario());
		System.out.println("Salario do diretor � igual: " + diretor.Salario());
		System.out.println("Salario do secret�rio � igual: " + secretario.Salario());
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais" 
		+ pessoa.getNome() + "E o sal�rio � de: " + pessoa.Salario());
	}
}
