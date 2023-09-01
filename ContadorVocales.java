package com.mycompany.tallerjava;

import java.util.Scanner;

public class ContadorVocales {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        int contador = 0;
        System.out.println("Introduzca una palabra: ");
        palabra = entrada.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) 
        {
            if((palabra.charAt(i))== 'a' || (palabra.charAt(i)) == 'e' || (palabra.charAt(i)) == 'i' || (palabra.charAt(i)) == 'o' || (palabra.charAt(i)) == 'u')
            {
                contador++;
            }       
         }
            System.out.println("La palabra " + palabra + " contiene " + contador +  " vocales " );
    }
    
}
