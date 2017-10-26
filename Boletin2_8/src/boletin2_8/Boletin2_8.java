package boletin2_8;

import java.util.Scanner;

public class Boletin2_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Introduzca la cantidad de billetes de 100: " );
        int num100 = sc.nextInt();
        System.out.print( "Introduzca la cantidad de billetes de 20: " );
        int num20 = sc.nextInt();
        System.out.print( "Introduzca la cantidad de billetes de 5: " );
        int num5 = sc.nextInt();
        System.out.print( "Introduzca la cantidad de monedad de 1: " );
        int num1 = sc.nextInt();
        
        int euros = num100*100+num20*20+num5*5+num1*1;
        System.out.println( "A inroducido un total de "+euros+" euros" );
    }
    
}
