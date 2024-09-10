package Ejercicios;

public class E13_Palindromo {
    public static void main(String[] args){
        int a = 1221;
        int invierte = 0;
        int original = a;
        while (a != 0){
            int ultimo = a % 10;
            invierte = (invierte * 10 ) + ultimo;
            a = a / 10;
        }
        if (original == invierte){
           System.out.println("El número " +original+ " es palíndromo");
        }
        else System.out.println("el número " +original+ " no es palíndromo");
    }

}