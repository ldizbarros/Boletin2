package boletin2_7;

import java.util.Scanner;

public class Boletin2_7 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int K = 273;
        
        System.out.print( "Introduzca los grados centigrados: " );
        float grados = sc.nextFloat();
        
        float gradosK = grados+K;
        float gradosF = 32 + 1.8F* grados;
        
        System.out.println( grados+" grados centigrados son "+gradosK+" grados kelvin y "+gradosF+" grados Fahrenheit" );
    }
    
}
