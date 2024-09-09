package Ejercicios;

import com.sun.source.tree.WhileLoopTree;

public class Fibonacci {
    public static void main(String[] args){
        int n = 10;
        int x = 0;
        int y = 1;
        int fibo = 1;

        for (int i = 1; i <= n; i++)
        {
            fibo = x + y;
            x = y;
            y = fibo;


            System.out.println("El Fibonacci de " +n +  " es: " +fibo);
        }
    }

}


