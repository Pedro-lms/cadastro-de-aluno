package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {/*Executa o que queremos*/
			/*C�digo da rotina*/
			
			public void run(){
			/*C�digo da rotina que eu quero executar em paralelo*/
			for(int i = 0; i < 10; i++ ) {
				
				/*Executando com tempo de encerramento, ou tempo pr� determinado*/
				System.out.println("Executando uma rotina com tempo determinado, tipo email");
		
				try {
				Thread.sleep(1000); /*Determina o tempo*/
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			/*Fim do c�digo paralelo*/
			
			}
		};
	}.start();/*Start liga a Thread, que fica processando, paralelamente por tr�s*/
		
		
		
		/*C�digo do sistema que continua no fluxo de trabalho*/
		System.out.println("Chegou ao fim do c�digo teste de Thread");
		/*Fluxo do sistema, cadastro de venda, etc*/
		JOptionPane.showConfirmDialog(null, "Sistema continua executando para o usu�rio");
	}
}
