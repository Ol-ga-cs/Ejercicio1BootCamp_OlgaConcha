package Ejercicios;

public class E14_Conversion_Decimal_Binario {

    public static void main(String[] args) {
        int exp, digito;
        double binario;
        int a = 45;
        int original = a;
        exp=0;
        binario=0;

        while(a!=0){
            digito = a % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            a = a/2;
        }
        System.out.printf("El Número original es: " + original);
        System.out.println("\nConvertido en binario, es: " +binario);
    }
}