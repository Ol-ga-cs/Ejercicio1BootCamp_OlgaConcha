package Ejercicios;

public class E16_Suma_Digitos_Numero {

    public static void main(String[] args) {
        int digito, suma;
        int a = 5678;
        int original = a;
        suma =0;

        while (a != 0) {
            digito = a % 10;
            suma = suma + digito;
            a = a / 10;
        }
        System.out.println("La suma de sus digitos es: " + suma);
    }
}
