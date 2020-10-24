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
		secretario.setExperiencia("Administração");
		secretario.setNome("Joãozinho");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.mensagemMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno é igual: " + aluno.Salario());
		System.out.println("Salario do diretor é igual: " + diretor.Salario());
		System.out.println("Salario do secretário é igual: " + secretario.Salario());
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais" 
		+ pessoa.getNome() + "E o salário é de: " + pessoa.Salario());
	}
}
