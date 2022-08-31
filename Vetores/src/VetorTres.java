import java.util.Scanner;

public class VetorTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 4;
		int [] vet = new int [TAM];
		float media = 0;
		int somanota = 0;
		
		for(int x = 0; x <= TAM-1; x++){
			System.out.println("Informe a "+(x+1)+"º nota!");
			vet[x] = entrada.nextInt();
			somanota = somanota + vet[x];
	}
		media = somanota / 4;
		
		for(int x = 0; x <= TAM-1; x++){
			System.out.println(vet[x]);
			if(x == 3){
				System.out.println("A média do aluno foi "+media);
			}
		}
		
		entrada.close();
		
	}
}
