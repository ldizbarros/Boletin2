package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int M = 1852; 
        System.out.print( "Introduzca el numero de millas: " );
        float millas = sc.nextFloat();
        
        float metros=millas*M;
        System.out.println(millas+" millas son "+metros+" metros");
    }
    
}
