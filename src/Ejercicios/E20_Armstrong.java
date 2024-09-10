package Ejercicios;

public class E20_Armstrong {
    public static void main(String[] args) {
        int a = 153;
        int original = a;
        int  digito;
        int suma = 0;

        while(a > 0){
            digito = a % 10;
            a = a / 10;
            suma = suma + (digito * digito * digito);

        }
        if(original == suma)
            System.out.println("El número " +original+ " es Armstrong");

        else

            System.out.println("El número " +original+ " no es Armstrong");

    }
}
