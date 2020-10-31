package cursojava.excecao;

@SuppressWarnings("serial")
public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super(erro);
	}
}
