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
public class Exercice8 {
    
     public static void launch(){
    //j'initialise une valeur entière à 243 
        int a = 243;
    /**
     * je décremente la valeur de a,
     * pour cela j'initialise un index qui me sert de repère
     * tant que la valeur de mon index est inférieur à la variable a
     * alors le code sera execute,la valeur de a est décrementer jusqu'a 0
    **/
        for (int i = 0;a >= i;a--){
            
            /**
             * si i est paire,il ne restera pas de reste de division euclidiene
             * donc i sera égale a 0,dans le cas contraire il sera impaire car
             * il aura des restes de division
             * les multiple de 2 sont paire !!!
             */
            
            i = a%2;
            
            if(i==0){
                
                System.out.println(a + " est pair");
            }
            else {
                System.out.println(a + " est impaire");
                
            }
           /**
            * si i est un multiple de 5,alors i0 sera égale a 0
            * sinon c'est pas un multiple de 5
            */ 
           i = a%5;
           
           if(i == 0){
               
               System.out.println("c'est un multiple de 5"); 
              
           }
           else{
               System.out.println("c'est pas un mutiple de 5");
           }
           
           /**
            * si i est un multiple de 10 alors rebelote, i est égale a 0
            * sinon,si il reste des reste de division euclidiene que le modulo
            * aura retourner,c'est pas un multiple de 10
            */
           i= a%10;
           
           if(i==0){
               
               System.out.println("c'est un multiple de 10 aussi");
           }
           else{
               System.out.println("ni,un multiple de 10");
           }
        }
         
    }
    
}
