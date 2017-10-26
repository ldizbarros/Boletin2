package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Introduzca los euros: " );
        int euros = sc.nextInt();
        
        int bill100 = euros/100;
        int bill20 = (euros%100)/20;
        int bill5 = ((euros%100)%20)/5;
        int bill1 = ((euros%100)%20)%5;
        
        System.out.println( "Tienes "+bill100+" billetes de 100, "+bill20+
                " billetes de 20, "+bill5+" billetes de 5 y "+bill1+" monedas de 1 euro" );
    }
    
}
