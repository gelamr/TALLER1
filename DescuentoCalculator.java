package com.mycompany.tallerjava;

import java.util.Scanner;

public class DescuentoCalculator {
    
    public static void main(String[] args) 
    {
        Scanner entrada =new Scanner(System.in);
        float precio, descuento, valor;
        System.out.println("Ingrese el precio:");
        precio = entrada.nextFloat();
        System.out.println("Ingresa el descuento:");
        descuento = entrada.nextFloat();
        valor = precio -(precio * (descuento/100));
        System.out.println("El valor total es:" + valor);
        
    }
    
}
