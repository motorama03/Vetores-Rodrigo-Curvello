import java.util.Scanner;

public class VetorDose {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int idade[] = new int[TAM];
		float altura[] = new float[TAM];
		int maisvelho = 0;
		float maisalto = 0;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe a idade e a altura do usuário!");
			idade[x] = entrada.nextInt();
			System.out.println("Agora informe a altura!");
			altura[x] = entrada.nextFloat();
			
			if(x == 0){
				maisvelho = idade[x];
				maisalto = altura[x];
			}
			else{
				if(idade[x] > maisvelho){
					maisvelho = idade[x]; 
			}
				if(altura[x] > maisalto){
					maisalto = altura[x];
				}
		}
		
	}
		System.out.println("O mais velho tem "+maisvelho+" anos!");
		System.out.println("O mais alto tem "+maisalto+" de altura!");
		System.out.println(" ");
		System.out.println("E esses foram os valores digitados >>>");
		for(int x = 0; x < TAM; x++){
			System.out.println("a idade "+idade[x]);
			System.out.println(" e a altura "+altura[x]);
		}
		entrada.close();

	}
}
