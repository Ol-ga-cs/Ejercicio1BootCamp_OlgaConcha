package Ejercicios;

public class Inversion_numero {
    public static void main(String[] args){
        int a = 54321;
        int invierte = 0;
        int original = a;
     while (a != 0){
         int ultimo = a % 10;
         invierte = (invierte * 10 ) + ultimo;
         a = a / 10;
     }
        System.out.println("El número original es: " +original);
        System.out.println("El número invertido es " +invierte);

    }
}
