package Ejercicios;

public class Intercambio_Valores {

    public static void main(String[] args) {
        int a = 5;
        int b= 10;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Al intercambiar los valores, quedan: a = " +a+ " y b = " +b);
        System.out.println("Inicialmente los valores eran: a = " +b+ " y b = " +a);
    }
}
