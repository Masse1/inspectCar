/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectcar.integration;

import java.util.List;

/**
 *
 * @author masaralmosawi
 */
public class Printer {
    
    public void printResult(List<InspectionItem> inspectionList , int cost){
        
        for(InspectionItem e : inspectionList){
            String status = "Repaired"; 
            if(!e.getResult())
                status ="Not Repaired";
            System.out.println(e.getName() + " is: " + status);
        }
            
           System.out.println("Payment Authorized, amount to pay: " + cost+" Kr");
        
          // System.out.println("Current value in counter is now: " + amount+ " Kr");
    } 
}
    