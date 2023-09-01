package com.mycompany.tallerjava;

import java.util.Scanner;

public class NumerosPar_Impar {

  
    public static void main(String[] args) 
    {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = entrada.nextInt();
        
        if (numero%2==0){
            System.out.println("El número ingresado es par");
        }
        else{
            System.out.println("El número ingresado NO es par");
        }
    }
    
}
