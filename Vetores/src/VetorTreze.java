import java.util.Scanner;

public class VetorTreze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		final int MAT = 20;
		int avet[] = new int [TAM];
		int bvet[] = new int [TAM];
		int cvet[] = new int [MAT];
		int count = 0;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe valores para os vetores!");
			avet[x] = entrada.nextInt();
			bvet[x] = entrada.nextInt();
			if (x == 9){
				for(int y = 0; y < TAM; y++){
					if(y == 0){
						count = -1;
					}
					count = count +1;
					cvet[count] = avet[y];
					count = count + 1;
					cvet[count] = bvet[y];
					if(y == 19){
						System.out.println("Deu boa!");
					}
				}
			}
		}
		
		for(int x = 0; x < MAT; x++){
			System.out.println(cvet[x]);
		}
		
		entrada.close();
		
	}

}
