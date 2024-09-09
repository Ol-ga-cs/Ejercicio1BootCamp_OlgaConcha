package Ejercicios;

public class Suma_Pares_Rango {

    public static void main(String args[]) {
        int b = 100;
        int a = 1;
        int suma =0;
        for (int i = 0; i <= b; i++) {
            if (i % 2 == 0) {
                a = i;
                suma = suma + a;
            }
        }
        System.out.println("\nLa suma de los números pares del rango " +b+ " es: "+ suma);

    }
}

