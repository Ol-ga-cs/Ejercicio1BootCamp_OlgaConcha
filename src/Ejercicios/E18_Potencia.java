package Ejercicios;

public class E18_Potencia {

    public static void main(String args[]) {
        int a = 2;
        int b = 8;
        int potencia =1;
        for (int i = 1; i <= b; i++) {
            potencia = potencia * a;
        }
        System.out.println("El resultado de " +a+ " elevado a " +b+ " es: " +potencia);

    }
}
