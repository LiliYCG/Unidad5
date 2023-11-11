package practica2u4u5;


public class Practica2U4U5 {

    
    public static void sumar(int  num1, int num2) {
        int sumar = num1 + num2;
           System.out.println("Suma: " + sumar);
    }

   
    public static void restar(int num1, int num2) {
        int  restar = num1 - num2;
        System.out.println("Resta: " + restar);
    }

   
    public static void multiplicar(int num1, int num2) {
        int multiplicar =num1 * num2;
        System.out.println("multiplicacion: " + multiplicar);
    }

    
    public static void dividir(int num1, int num2) {
         int  dividir = num1 / num2;
        System.out.println("División: " + dividir);
    }
    public static void main(String[] args) {
    int num1 =10;
    int num2 =2;
    Practica2U4U5.sumar(num1, num2);
    Practica2U4U5.restar(num1, num2);
    Practica2U4U5.multiplicar(num1, num2);
    Practica2U4U5.dividir(num1, num2);
    
        System.out.println("Lili carbajal");
    }
}