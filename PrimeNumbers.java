import prog.io.*;


public class NumeroPrimo {

	public static void main(String[] args){
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
int x = in.readInt("Fino a dove devo estrapolare i numeri primi? \nInserisci il numero:\t");
		
		int numeroprimo[] = new int[x];

		for(int i = 1; i<=x; i++)
			for(int j = 2; j<=x+1; j++){
				
				if(i % j == 0 && i != j)
					break;
				
				if(j == x+1 && i % j != 0)
					numeroprimo[i-1] = i;
			}

			
	
		
		for(int i = 0; i<x; i++){
		if(numeroprimo[i] != 0 && numeroprimo[i] != 1)
			out.print(" "+numeroprimo[i]+" ");
		}
	}
}
