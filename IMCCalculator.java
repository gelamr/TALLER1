package com.mycompany.tallerjava;

import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        float kg, mts, imc , z;
        System.out.println("Ingresa tu peso:");
        kg = entrada.nextFloat();
        System.out.println("Igresa tu altura:");
        mts = entrada.nextFloat();
        imc = (mts * mts);
        z = kg/imc;
        
        
        System.out.println("Tu indice de masa corporal es: " + z);
        
        
    }
    
}
