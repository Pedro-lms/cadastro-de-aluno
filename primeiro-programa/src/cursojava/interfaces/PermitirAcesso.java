package cursojava.interfaces;

/*Interface neste caso, ser� nosso contrato de autentificaca��o*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); /*Apenas declara��o*/
	public boolean autenticar();
}
