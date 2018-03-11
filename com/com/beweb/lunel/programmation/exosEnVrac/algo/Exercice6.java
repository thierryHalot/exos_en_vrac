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
public class Exercice6 {
    
      public static void launch(){
        
        // j'initialise un tableau de boolean de longueur 10
        boolean [] tableauBoolean = new boolean[10];
        
        int i = 0;
      /**
       * si i est inférieur à 10 alors le code est executé
       * il devrais etre effectuer 9 fois
       */          
        while(i < tableauBoolean.length){
            
            //pour chaque execution du code ,la valeur  de chaque case est vrai
            tableauBoolean[i] = true;
            
        i++;  
       
            
        }
        
        
        /**
         * si i < 10 alors le code est executé
         * 9 fois de nouveaux
         */
        while(i < tableauBoolean.length){
            
            //les valeur du tableaux devrais retourné faux !!!
            tableauBoolean[i] = false;
            
            i++;
        }
        while(i < tableauBoolean.length){
        /**
         * si i est un nombre pair alors j'execute le code
         * qui dit que tous les case paire doivent retourné vrai
         */
        
            if(i == i%2 ){
                
                tableauBoolean[i] = true;
                i++;
                
         // ou alors elle doivent retourné faux si elle sont impaire       
                
            }else{
                
                tableauBoolean[i] = false;
                i++;
                
            }
            //le résultat ne s'afiche pas !!!!! 
            System.out.println(tableauBoolean[i]);
        } 
      
          
        
    }
    
}
