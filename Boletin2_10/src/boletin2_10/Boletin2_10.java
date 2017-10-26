package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print( "Introduzca el sueldo base: " );
        float sueldo = sc.nextFloat();
        System.out.print( "Introduzca las ventas totales: " );
        float ventas = sc.nextFloat();
        System.out.print( "Introduzca los km recorridos: " );
        float km = sc.nextFloat();
        System.out.print( "Introduzca los dias: " );
        float dias = sc.nextFloat();
        
        float sueldoB = sueldo+ventas*0.05F+2*km+30*dias;
        float sueldoL = sueldoB-(sueldoB*0.18F+2);
        
        System.out.println( "Sueldo Bruto = "+sueldoB+" sueldo líquido = "+sueldoL);
    }
    
}
