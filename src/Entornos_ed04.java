/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos_ed04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Entornos_ed04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int anio;
        
        System.out.println("Introduce el año");
        anio=sc.nextInt();
        
        if(!calculoBisiesto(anio)){
            System.out.println("El año " + anio + " es bisiesto ");
        }else{
            System.out.println("El año " + anio + " no es bisiesto ");
        }
      
    }
    public static boolean calculoBisiesto(int a){
        if(a%4==0 && a%100!=0 || a%400==0)      //devuelve true si es bisiesto
            return false;                       //devuelve false si es bisiesto
        else
            return true;
    }
}
