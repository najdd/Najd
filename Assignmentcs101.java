/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment;
import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your job in PSU? 0- admin 1- academic 2-student");
        int job = input.nextInt();
        if 
                ( job > 2 ) 
            System.out.println("Choose from the range 0-2");
        else if (job == 0){
           System.out.println("Enter Training Workshops");
        int WS = input.nextInt(); 
        System.out.println("Enter number of service years ");
        int SY = input.nextInt();
       
        } else if (job == 1){
            System.out.println("Enter number of research publications: ");
        int RP = input.nextInt();
        System.out.println("Enter number of years in service");
        int SY2 = input.nextInt();
        } else if (job == 2)
            System.out.println("Enter number of courses enrolled");
        int courses = input.nextInt(); 
        System.out.println(" and your GPA");
        double gpa = input.nextDouble();
    }
        switch (job){
            case 0:
                if ( WS <= 5)
                    System.out.println(" Your Salary is " + WS*100.0*SY);
                else if 
                    System.out.println("Your salary is " + WS*150.0*SY );
                else if 
                        (WS <= 15 )
                    System.out.println("Your Salary is " + WS*200.0*SY);
                else 
                    System.out.println("Your Salary is " + WS*300.0*SY);
            case 1: 
                if (RP <= 5)
                    System.out.println("Your salary is " + RP*200.0*SY2);
                else if
                        (RP <= 10)
                    System.out.println("Your Salary is " + RP*250.0*SY2);
                else if 
                        (RP <=15 )
                    System.out.println("Your Salary is " + RP*300.0*SY2);
                else 
                    System.out.println("Your Salary is " + RP*400.0*SY2);
            case 2: 
                if 
                        (courses <= 3)
                    System.out.println("Your Rewards is " + courses*200.0*gpa);
                else if 
                        (courses <= 4)
                    System.out.println("Your Reward is " + courses*250.0*gpa);
                else if 
                        (courses <= 5)
                    System.out.println("Your Reward is " + courses*300.0*gpa);
                else 
                    System.out.println("Your Reward is " + courses*350.0*gpa);
        }
                
        
    } 

            
    
            

