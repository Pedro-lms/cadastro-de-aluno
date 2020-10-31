package cursojava.executavel;

public class Matriz2 {

	public static void main(String[] args) {
		
		int notas[][] = new int[3][4]; 
		
		/* [0]LINHA [0,1,2] COLUNA*/
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		notas[0][3] = 40;
		
		/* [1]LINHA [0,1,2] COLUNA*/
		notas[1][0] = 20;
		notas[1][1] = 30;
		notas[1][2] = 40;
		notas[1][3] = 47;
		
		/* [2]LINHA [0,1,2] COLUNA*/
		notas[2][0] = 55;
		notas[2][1] = 15;
		notas[2][2] = 99;
		notas[2][3] = 49;
		
		for (int posLinha = 0; posLinha < notas.length; posLinha++) { // notas.length = numero de colunas dentro da linha
			
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				
				System.out.print(notas[posLinha][posColuna] + "  ");
				
			}
			System.out.println();
		}
		
	}
}