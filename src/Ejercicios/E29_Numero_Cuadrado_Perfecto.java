package Ejercicios;

public class E29_Numero_Cuadrado_Perfecto {
    public static void main(String[] args) {
        int numero = 64;
        int raiz = 0;
        while (raiz * raiz <= numero) {
            if (raiz * raiz == numero) {
                System.out.println(numero + " es un cuadrado perfecto.");
                return;
            }
            raiz++;
        }
        System.out.println(numero + " no es un cuadrado perfecto.");
    }

}