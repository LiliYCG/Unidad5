package piramide;

import java.util.Scanner;

public class Piramide {

    public static void Pasterisco(int h) {

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Pletra(int h) {
        int num = 1;
        char letra = 'A';

        for (int i = 1; i <= h; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + "");
                    num++;
                }
            } else {
                for (int k = 1; k <= i; k++) {
                    System.out.print(letra);
                    letra++;
                }
            }
            System.out.println();
        }
    }


        public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        int opc;
        do {
           
            System.out.println("Seleccione opcion: ");
            System.out.println("1. Piramide asteriscos");
            System.out.println("2. Piramide letras ");
            
            opc = P.nextInt();
            switch (opc) {
                case 1:
                    
                    System.out.println("¿altura?");
                    int alturaA = P.nextInt();
                    Pasterisco(alturaA);
                    break;

                case 2:
                    
                    System.out.println("¿altura?");
                    int alturaL = P.nextInt();
                    Pletra(alturaL);

                    break;
              
            }
        }while (opc != 1);
        P.close();
      
    }

}
