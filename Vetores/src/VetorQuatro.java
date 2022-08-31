import java.util.Scanner;

public class VetorQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int consoas = 0;
		final int TAM = 10;
		char vet[] = new char [TAM];
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe um caractere para o "+(x+1)+"º posição do vetor");
			vet[x]  = entrada.next().charAt(0);
			if(vet[x] == 'a' || vet[x] == 'e' || vet[x] == 'i' || vet[x] == 'o' || vet[x] == 'u'){
				
			}
			else{
				consoas = consoas + 1;
			}
		}
		for(int x = 0; x < TAM; x++){
			System.out.println(vet[x]);
		}
		
		System.out.println("Foi digitado "+consoas+" consoantes!");
		entrada.close();
		
	}

}
