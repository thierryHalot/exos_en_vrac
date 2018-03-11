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
public class Exercice4 {
    public static void launch(){
        
        // je déclare une variable booleene
        boolean flag;
        //pour que mon programme puisse marcher j'affecte une valeur à flag
        flag = false;
        //j'initialise une variable entière à 0
        int a = 0;
        
        /**
         * j'incrémente la variable a si le boolean est égale a false
         */
                
         if (flag== false){
             a ++;
             
         }
         if(flag==true){
             
             a--;
             
         }
         
         //attention on uttilise l'inverse car on n'est pas censé connaitre
         //la valeur de flag
         // ! veut dire est l'inverse de 
         flag = !flag;
         
         //si flag est égale à vrai alors j'execute le code en desous 
         if(flag==true){
         // la variable a,est incrementer    
             a++;
             System.out.println("la valeur de a est "+ a +" ,a = true");
         }// si flag est égale à faux alors....
         if(flag==false){
         //la variable a sera décrémenter    
         a--;
             System.out.println("la valeur de a est "+ a + "a = false");
         }
         /**
          * Pour connaitre la valeur de flag,je me sert d'un systeme.out
          * de cette maniere je peut affirmé que la valeur de flag retourne vrai
          * dans ce code,s'étais prévisible car on a déclarer flag faux au début 
          * puis on a dit ensuite qu'il fallait inverser sa valeur,
          * donc il retourne vrai
          */
        
        
      
    }
    
}
