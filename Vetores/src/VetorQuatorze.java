import java.util.Scanner;

public class VetorQuatorze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 30;
		int idade[] = new int[TAM];
		float altura[] = new float[TAM];
		
		int qntaltura = 0;
		float medaltura = 0;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe a idade do usuário!");
			idade[x] = entrada.nextInt();
			System.out.println("Agora informe a altura!");
			altura[x] = entrada.nextFloat();
			medaltura = medaltura + altura[x];
			
			if(x == TAM-1){
				medaltura = medaltura / 30;
				for(int y = 0; y < TAM; y++){
					if(idade[y] >= 13 || altura[y] > medaltura){
						qntaltura = qntaltura + 1;
					}
				}
			}
		}
		
		System.out.println(qntaltura+" Possuem a altura acima de "+medaltura);
		
		entrada.close();
		
	}
	}