/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suma;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Suma {
    public static void main(String[] arg){
        Scanner l= new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.println("Ingrese un numero:");
        a=l.nextInt();
        System.out.println("Ingrese un numero:");
        b=l.nextInt();
        c=a+b;
        d=a-b;
        System.out.println("La suma es: "+c);
                System.out.println("La resta es: "+d);
    }
}
