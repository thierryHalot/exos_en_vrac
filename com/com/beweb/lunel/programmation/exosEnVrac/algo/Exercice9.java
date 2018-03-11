/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author thierry
 */
public class Exercice9 {
    public static void launch(){
        
        int a = 243;
        int b = 243;
        int i = 0;
        int c = 0;
        while(a >= 0){
           
            i= a%10;
           
            
            if(i==0){
                
                b = a - 1;
                c = a + b;
                
                System.out.println("multiple de 10 alors " + a + " + " + b + " = " + c );
                
                
                
            }else{
                System.out.println("ce n'est pas un multiple de 10 : " + a);
                
                
            }
        
            
            i= a%2;
            
            if(i==0){
                
                b= a - 2 ;
                c= a + b;
                System.out.println("valeur paire alors "+ a + " + " + b + " = " + c );
                
            }else{
                System.out.println("valeur impaire : " + a);
                
            }
            i = a%5 ;
            
           if(i==0){
            i = a%3;   
               if(i==0){
               System.out.println(a + " : vraix");
               a--;
               }else{
                   System.out.println(a + " : faux");
                  a--; 
               }
           }else{
               System.out.println(a + " : faux");
               a--;
           }
            
        }
        
    }
    
}
