package Ejercicios;

public class Factorial {
    public static void main(String[] args) {
        int a = 6;
        int fact = 1;

        for (int x = 1; x <= a; x++)
            fact = fact * x;

        System.out.println("El factorial del número " +a +  " es " +fact);

    }
}
