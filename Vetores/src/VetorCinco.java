import java.util.Scanner;

public class VetorCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 20;
		int vet[] = new int [TAM];
		int vetpar[] = new int [TAM];
		int vetimpar[] = new int [TAM];
		int posicaopar = 0;
		int posicaoimpar = 0;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe um valor para um de seus vetores!");
			vet[x] = entrada.nextInt();
			
			if(vet[x] % 2 == 0){
				vetpar[posicaopar] = vet[x];
				posicaopar = posicaopar + 1;
			}
			else{
					vetimpar[posicaoimpar] = vet[x];
					posicaoimpar = posicaoimpar + 1;
			}
		}
		System.out.println("Vetor com todos valores");
		for(int x = 0; x < TAM; x++){
			System.out.print(vet[x] +" || ");
		}
		
		System.out.println("");
		
		System.out.println("Vetor par");
		for(int x = 0; x <= (posicaopar - 1); x++ ){
			System.out.print(vetpar[x] + " || ");
		}
		
		System.out.println("");
		
		System.out.println("Vetor impar");
		for(int x = 0; x <= (posicaoimpar - 1); x++ ){
			System.out.print(vetimpar[x] + " || ");
		}
		
		entrada.close();
		
	}

}
