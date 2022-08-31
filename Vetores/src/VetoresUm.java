import java.util.Scanner;

public class VetoresUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5; 
		int [] vet = new int[TAM];
		
		System.out.println("Informe 10 números!");
		for(int x = 0; x <= TAM-1; x++){
			System.out.println("Informe o "+(x+1)+"º número!");
			vet[x] = entrada.nextInt();
		}
		for(int y = 0; y <= TAM-1; y++){
			System.out.println((y+1)+"º vetor é "+vet[y]);
		}
		
		entrada.close();
		
	}

}
