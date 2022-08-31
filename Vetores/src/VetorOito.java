import java.util.Scanner;

public class VetorOito {

    public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);

    System.out.println("Infome o tamanho da senha que deseja(max:20): ");
    int iTam = entrada.nextInt();

    int k = -1;

    String [] alfacons = new String [21];
    alfacons[0] = "b";
    alfacons[1] = "c";
    alfacons[2] = "d";
    alfacons[3] = "f";
    alfacons[4] = "g";
    alfacons[5] = "h";
    alfacons[6] = "j";
    alfacons[7] = "k";
    alfacons[8] = "l";
    alfacons[9] = "m";
    alfacons[10] = "n";
    alfacons[11] = "p";
    alfacons[12] = "q";
    alfacons[13] = "r";
    alfacons[14] = "s";
    alfacons[15] = "t";
    alfacons[16] = "v";
    alfacons[17] = "w";
    alfacons[18] = "x";
    alfacons[19] = "y";
    alfacons[20] = "z";

    String[] alfavog = new String [5];

    alfavog[0] = "a";
    alfavog[1] = "e";
    alfavog[2] = "i";
    alfavog[3] = "o";
    alfavog[4] = "u";

    String[] pass = new String[iTam];

    for(int i = 0; i < iTam ; i++) {
        if (i % 2 == 0) {
            pass[i] = alfacons[i]; 
        }else {
            k++;
            pass[i] = alfavog[k];
            if(k == 4) {
                k = -1;
            }
        }
    }
    for(int i = 0; i<iTam;i++) {
        System.out.print(pass[i]);
    }


    entrada.close();
    
    }


}