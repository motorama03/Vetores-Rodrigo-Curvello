import java.util.Scanner;

public class VetorOnze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		String TheBestProfessor = "rodrigo;curvello;antonio;lindo";
		String resultado[] = TheBestProfessor.split(";");
		
		for(int x = 0; x < 4; x++){
			System.out.print(resultado[x]+" | ");
		}
		
		entrada.close();
		
	}

}