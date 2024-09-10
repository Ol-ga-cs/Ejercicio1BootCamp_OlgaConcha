package Ejercicios;

public class E23_Divisibilidad {
    public static void main(String[] args) {
        int a = 45;
        int x = 2;
        int y = 3;
        int z = 5;

        if (a % x == 0) {
            System.out.println(a + " es divisible por " +x);
        }
        else System.out.println(a + " no es divisible por " +x);

        if (a % y == 0) {
            System.out.println(a + " es divisible por " +y);
        }
        else System.out.println(a + " no es divisible por " +y);
        if (a % z ==0){
            System.out.println(a + " es divisible por " +z);
        }
        else System.out.println(a + " no es divisible por " +z);
    }
}
