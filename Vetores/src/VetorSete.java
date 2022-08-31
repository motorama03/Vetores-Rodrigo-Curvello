import java.util.Scanner;

public class VetorSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int vet[] = new int[TAM];
		int soma = 0;
		int multip = 1;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe um valor para o vetor!");
			vet[x] = entrada.nextInt();
			soma = soma + vet[x];
			multip = multip * vet[x];
		}
		
		System.out.println("Assim ficou seu vetor!");
		for(int x = 0; x < TAM; x++){
			System.out.print(vet[x]+" || ");
		}
		
		System.out.println("");
		
		System.out.println("A multiplicação dos valores é "+multip);
		System.out.println("A soma dos valores é de "+soma);
		
		entrada.close();
	}

}
