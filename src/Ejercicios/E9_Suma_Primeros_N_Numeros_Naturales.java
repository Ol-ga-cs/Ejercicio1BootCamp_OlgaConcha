package Ejercicios;

public class E9_Suma_Primeros_N_Numeros_Naturales {
    public static void main(String[] args) {
        int n = 50;
        int cont = 0;
        int suma = 0;
        while (cont <= n) {
            suma = suma + cont;
            cont++;
            }
            System.out.println("La suma de los primeros " +n+ " números naturales es " + suma);
        }
    }

