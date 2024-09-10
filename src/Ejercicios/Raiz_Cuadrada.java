package Ejercicios;

public class Raiz_Cuadrada {

         public static void main(String[] args) {
            double a = 64;
            double original = a;
            if (a < 0) {
                System.out.println("El número debe ser no negativo.");
            }

            while ((original * original - a) > 0 || (a - original * original) > 0) {
                original = (original + a / original) / 2;
            }

            System.out.println("La raíz cuadrada de " + a + " es: " + original);
        }
}





