package com.mycompany.tallerjava;

import java.util.Scanner;

public class NúmerosPrimos {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero:");
        num = entrada.nextInt();
        
        boolean auxiliar = true;
        
        for(int i=2; i<num; i++){
            if(num%i == 0){
            auxiliar = false;
            break;
          
            }
        }

        if(auxiliar){
        System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
    
}
