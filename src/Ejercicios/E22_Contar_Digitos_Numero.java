package Ejercicios;

public class E22_Contar_Digitos_Numero {
    public static void main(String[] args) {
        int cantidad = 0;
        int a = 987654;
        int original = a;

        while (a > 0){
            a = a / 10;
            cantidad++;
        }

        System.out.println("El número "+original + " tiene " + cantidad + " dígitos");
    }
}
