package dojo.caixaeletronico;
public class Terminal {

	
	private int[] notas = {10,20,50,100};
	
	private int []qtdNotas = {0,0,0,0};
	
	public int[] saque(int valor){
		
		for (int i = notas.length - 1; i >= 0; i--) {
			if(valor/notas[i] >= 1){			
				qtdNotas[i] = valor/notas[i];
				
				if(valor % notas[i] > 0){
					saque(valor % notas[i]);					
				}				
				return qtdNotas;
			}
		}		
		return qtdNotas;		
	}
}
