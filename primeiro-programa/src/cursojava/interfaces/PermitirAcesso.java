package cursojava.interfaces;

/*Interface neste caso, será nosso contrato de autentificacação*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); /*Apenas declaração*/
	public boolean autenticar();
}
