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
public class Exercice5 {
     public static void launch(){
        //j'initialise une valeur compteur à 10
        int compteur = 10;
        //Pour me repérer et savoir le nombre de fois que compteur est affiché
        //j'intialise un index à 1
        int i = 1;
        
        /**
         * dans que mon index est inférieur ou égal à 100
         * j'execute le code ci dessous
         * ce qui me donnera une valeur comprise entre 1 et 100,et a 100 la
         * boucle se fini !!!
         */
        
        while(i<=100){
            //affiche les valeur de mon compteur et de mon index qui me sert de repère
            System.out.println("Exercice 5 : " + i + " : la valeur de compteur est: " + compteur);
            //j'incrémente les valeur de compteur et de mon index
            //pour pouvoir avoir toute les valeur de compteur comprise entre 1 et 100
            
            compteur++;
            i++;
        }
        
    }
    
}
