import java.util.Scanner;

public class VetorSeis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 4;
		float nota[] = new float [TAM];
		int count = 0;
		float med = 0;
		float notas = 0;
		
		for(int x = 0; x < TAM; x++){
			System.out.println("Informe 4 notas do "+(x+1)+"º aluno!");
			count = 1;
			med = 0;
			while(count <= 4){
				notas = 0;
				count = count + 1;
				System.out.println("Diga a nota!");
				notas = entrada.nextFloat();
				med = med + notas;
				nota[x] = (med / 4);
			}
			if(x == 1){
				nota[x] = med / 4;
			}
			else{
				if(x == 2){
					nota[x] = med / 4;
				}
				else{
					if(x == 3){
						nota[x] = med / 4;
					}
					else{
						nota[x] = med / 4;
					}
				}
			}
			
		}
		
		if(nota[0] >= 6 ){
			System.out.println("O primeiro aluno passou com média "+nota[0]);
		}
		if(nota[1] >= 6 ){
			System.out.println("O segundo aluno passou com média "+nota[1]);
		}
		if(nota[2] >= 6 ){
			System.out.println("O terceiro aluno passou com média "+nota[2]);
		}
		if(nota[3] >= 6 ){
			System.out.println("O quarto aluno passou com média "+nota[3]);
		}
		
		entrada.close();
		
	}

}
