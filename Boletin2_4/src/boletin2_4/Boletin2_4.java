package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Introduzca un numero: " );
        float num1 = sc.nextFloat();
        System.out.print( "Introduzca otro numero: " );
        float num2 = sc.nextFloat();
        
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
    
}
