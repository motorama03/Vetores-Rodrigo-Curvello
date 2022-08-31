import java.util.Scanner;

public class VetorNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ou frase!");
		String palavra = entrada.next();
		int qntletras = palavra.length();
		
		char vet[] = new char[qntletras];
		
		for(int x = 0; x < qntletras; x++){
			System.out.print(palavra.charAt(x));
			vet[x] = palavra.charAt(x);
		}
		
		System.out.println("");
		
		for(int x = 0; x < qntletras; x++){
			System.out.print(vet[x]+" || ");
		}
		
		entrada.close();
		
	}

}