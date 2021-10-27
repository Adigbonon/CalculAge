/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.io.*;
//import java.util.Date;  
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Rodica
 */
public class Date {

    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
        Console entree =  System.console();
       
        try{
            System.out.println("Quelle est votre date de naissance ? : ");
            
            if (entree == null) {
                System.out.println(
                    "Pas de console. Lancez en ligne de commande.");
                return;
            }
            
            String date_annif = entree.readLine("Entrée : ");
            
            DateTimeFormatter format_date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthdate = LocalDate.parse(date_annif, format_date);
            LocalDate current_date = LocalDate.parse("27/10/2021", format_date);
            
            int age = AgeCalculator.calculateAge(birthdate, current_date);
            
            System.out.println("Vous avez : " + age + " ans");
         } catch(NullPointerException e){
            
         }
       
    }
    
}
