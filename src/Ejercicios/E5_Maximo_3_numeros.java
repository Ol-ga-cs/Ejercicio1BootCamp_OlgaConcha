package Ejercicios;

public class E5_Maximo_3_numeros {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;

        if (a > b)
        {
            if (a > c)
            {
                System.out.println("El mayor es " + a);
            } else
            {
                System.out.println("el mayor es " + c);
            }
        } else if (b > c)
        {
            System.out.println("el mayor es " + b);
        }
        else {
            System.out.println("el mayor es " + c);
        }

    }
}
