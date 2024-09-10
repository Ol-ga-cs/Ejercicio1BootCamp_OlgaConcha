package Ejercicios;

public class Suma_Multiplos_numero_rango {
    public static void main(String args[]) {
        int b =50;
        int a = 1;
        int suma =0;
        int mult = 3;
        for (int i = 0; i <= b; i++) {
            if (i % mult == 0) {
                a = i;
                suma = suma + a;
            }
        }
        System.out.println("La suma de los múltiplos de " +mult+ " del rango " +b+ " es: "+ suma);

    }
}
