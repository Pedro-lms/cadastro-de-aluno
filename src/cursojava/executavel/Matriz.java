package cursojava.executavel;

public class Matriz {
	
	/*Executar o c�digo java*/
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 50;
		notas[1][2] = 60;
	
		/*Percorre as linhas*/
		for(int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("-----------------------------");
			/*Percorrer as colunas*/
			for(int poscoluna =0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println(" " + notas[poslinha][poscoluna]);
			}
		}
	}
}
//Para quem n�o conseguiu compreender, segue c�digo que mostra em forma de tabela:

