package Ejercicios;

public class E28_MCD {
    public static void main(String[] args){
        int a = 48;
        int b = 18;
        int temp = b;
        int aoriginal = a;
        int boriginal = b;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El máximo común divisor entre " +aoriginal+ " y " +boriginal+ " es: "+a);
    }}
