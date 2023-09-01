package com.mycompany.tallerjava;

import java.util.Scanner;

public class CalculadoraFactorial {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = entrada.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        
    }
    
}
