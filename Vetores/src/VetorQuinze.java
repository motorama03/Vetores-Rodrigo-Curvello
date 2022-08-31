import java.util.Scanner;

public class VetorQuinze {

	public static void main(String[] args) {

		java.util.Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int vettam[] = new int [TAM];
		
		for(int x = 0; x<TAM; x++){
			System.out.println("Informe um valor inteiro para o vetor!");
			vettam[x] = entrada.nextInt();
		}
		
		System.out.println("Muito bem agora veja seus gráficos!");
		
		for(int x = 0; x<TAM; x++){
			System.out.print("Gráfico "+(x+1)+" ");
			
			for(int y = 0; y<vettam[x]; y++ ){
				System.out.print('#');
			}
			System.out.println(" ");
		}
	
		entrada.close();
		
	}

}
