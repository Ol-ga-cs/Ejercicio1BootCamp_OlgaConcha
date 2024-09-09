package Ejercicios;

public class Numeros_Perfectos {
    public static void main(String[] args) {
        int suma = 0;
        int a = 28;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == a) {
            System.out.println("El número " +a+ " es Perfecto");
        } else {
            System.out.println("El número " +a+ " no es perfecto");

        }
    }
}
