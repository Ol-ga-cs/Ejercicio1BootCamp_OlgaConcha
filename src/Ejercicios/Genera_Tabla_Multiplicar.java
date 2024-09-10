package Ejercicios;

public class Genera_Tabla_Multiplicar {

    public static void main(String[] args) {
        int a = 7;
        int limite = 12;
        
        System.out.println("Tabla de multiplicar del número " + a + ":");

        for (int i = 1; i <= limite; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
