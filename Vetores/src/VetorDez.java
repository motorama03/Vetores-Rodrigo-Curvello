import java.util.Scanner;

public class VetorDez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 3;
		int data[] = new int [TAM];
		
		System.out.println("Informe o dia1");
		int dia = entrada.nextInt();
		
		while(dia > 31 || dia < 1){
			System.out.println("Valor inválido, Informe 1 dia!");
			dia = entrada.nextInt();
		}
		data[0] = dia;
		
		System.out.println("Informe o mês!");
		int mes = entrada.nextInt();
		
		while(mes > 12 || mes < 1){
			System.out.println("Valor para mês inválido!");
			mes = entrada.nextInt();
		}
		data[1] = mes;
		
		System.out.println("Informe agora o ano!");
		int ano = entrada.nextInt();
		
		while(ano > 9999 || ano < 1000){
			System.out.println("Valor para ano inválido, coloque um valor válido!");
			ano = entrada.nextInt();
		}
		data[2] = ano;
		
		System.out.println("A data ficou assim");
		System.out.print("");
		System.out.print("/");
		for(int x = 0; x <= 2; x++){
			System.out.print(data[x]+"/");
		}
		
		entrada.close();
		
	}

}
