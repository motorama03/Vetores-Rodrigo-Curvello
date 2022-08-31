import java.util.Scanner;

public class VetorDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		final int MAT = 0;
		int [] vet = new int[TAM];
		
		for(int x = 0; x <= TAM-1; x++){
			System.out.println((x+1)+"º vetor ");
			vet [x] = entrada.nextInt(); 
		}
		for(int y = 9; y >= MAT; y--){
			System.out.print(vet[y]+" || ");
		}
		
		entrada.close();
		
	}

}