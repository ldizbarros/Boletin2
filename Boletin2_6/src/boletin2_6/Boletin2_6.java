package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print( "Introduzca el precio: " );
        float precio = sc.nextFloat();
        System.out.print( "Introduzca la tarifa: " );
        float tarifa = sc.nextFloat();
        
        System.out.println( "Se hace un descuento del "+(100-precio*100/tarifa)+"%");
    }
    
}
