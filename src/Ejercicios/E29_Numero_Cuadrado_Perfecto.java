package Ejercicios;

public class E29_Numero_Cuadrado_Perfecto {
    public static void main(String[] args) {
        int a = 64;
       /* if (esCuadradoPerfecto(a)) {
            System.out.println(a + " es un cuadrado perfecto");
        } else {
            System.out.println(a + " no es un cuadrado perfecto");
        }
    }*/

    //public static boolean esCuadradoPerfecto(int a) {
        for (int i = 1; i <= (a / 2); i++) {
            if (i * i == a) {
                System.out.println(a + " es un cuadrado perfecto");//return true;

            }
            else if (i * i != a) {
                System.out.println(a + " no es un cuadrado perfecto");
            }


     //   return false;
    }
}
}