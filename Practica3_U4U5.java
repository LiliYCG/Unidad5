package practica3_u4u5;

public class Practica3_U4U5 {

    public static void PromEst(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double prom = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                prom += calificaciones[i][j];
            }
            double p = prom / calificaciones[i].length;
            System.out.println("EL PROMEDIO DEL ESTUDIANTE: " + (i + 1) + " es de " + p);
        }
    }

    public static void mat(double[][] calificaciones) {
        for (int i = 0; i < calificaciones[0].length; i++) {
            double a = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                a += calificaciones[j][i];
            }
            double xd = a / 3;

            System.out.println("EL PROMEDIO DE la materia : " + (i + 1) + " es de " + xd);
        }
    }

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
        Practica3_U4U5.PromEst(calificaciones);
        Practica3_U4U5.mat(calificaciones);
        System.out.println("Lili Carbajal ");
        System.out.println("sandy Garduño");
        System.out.println("Tavo Becerril");
    }

}
