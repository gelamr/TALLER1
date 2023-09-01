package com.mycompany.tallerjava;

import java.util.Scanner;

public class TemperaturaConverter {
    
    public static void main(String[] args) {
    
     Scanner entrada =new Scanner(System.in);
     double v1, convers1, v2, convers2;
     System.out.println("Ingresa la cantidad en grados Celsius:");
     v1 = entrada.nextDouble();
     convers1 = (v1 * 9/5)+32;
     System.out.println("La temperatura en grados fahrenheit es:" + convers1);
    
    
     System.out.println("Ingresa la cantidad en grados fahrenheit:");
     v2 = entrada.nextDouble();
     convers2 = (v2-32)* 5/9;
     System.out.println("La temperatura en grados Celsius es;" + convers2);
        
    }
}
