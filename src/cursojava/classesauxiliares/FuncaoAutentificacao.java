package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber o contrato da interface  de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutentificacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutentificacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
