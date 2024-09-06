package Ejercicios;

public class Primos {

    public static boolean CalculaPrimo(int a){
        int cont = 2;
        boolean primo = true;
        while ((primo) && (cont!=a))
        {
            if (a % cont == 0)
                primo = false;
                cont++;
        }
        return primo;
    }

    public static void main(String[] args) {
        int b = 29;
        if (CalculaPrimo(b))
            System.out.println("Es numero primo");
        else
            System.out.println("NO es numero primo");

        }

    }


