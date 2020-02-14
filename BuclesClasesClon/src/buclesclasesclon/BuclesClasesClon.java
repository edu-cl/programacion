/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesclasesclon;

import java.util.Scanner;

/**
 *
 * @author matad
 */
public class BuclesClasesClon {

    static int ContadorTotal = 0;
    static int ContadoImpares = 0;
    static float SumaImpar = 0;
    static int MaxPar = -1;

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero ");
        n = teclado.nextInt();

        while (n >= 0) {
            if (EsPar(n)) {
                TratarPar(n);
            } else {

                TratarImpar(n);
            }
            ContadorTotal++;
            System.out.println("Introduce un numero ");
            n = teclado.nextInt();
        }
        //TODO: CALCULAR
        //PRESENTAR
        System.out.println("Numeros introducidos: " + ContadorTotal);
        System.out.println("Media de los impares: " +(SumaImpar/ContadoImpares));
        System.out.println("El mayor de los pares es: " +MaxPar);

    }

    public static boolean EsPar(int n) {

        return (n % 2) == 0;
    }

    public static void TratarPar(int n) {
        if (n > MaxPar) {
            MaxPar = n;
        }

    }

    public static void TratarImpar(int n) {
        SumaImpar = SumaImpar + n;
        ContadoImpares++;

    }
    
}
