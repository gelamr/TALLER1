package com.mycompany.tallerjava;

import java.util.Scanner;

public class TablasMultiplicar {

    public static void main(String[] args) 
    {
        Scanner entrada =new Scanner(System.in);
        int numero;
        System.out.println("---TABLA DE MULTIPLICAR---");
        System.out.println("Ingresa un numero");
        
        numero = entrada.nextInt();
        
        for(int i=1; i<=10; i++){
        
            System.out.println(numero+"*"+i+"="+numero*i);
        }
    }
    
}
