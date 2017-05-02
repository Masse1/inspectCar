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
    
    public void printResult(List<InspectionItem> inspectionList){
        
        for(InspectionItem e : inspectionList){
            String status = "Repaired"; 
            if(!e.getResult())
                status ="Not Repaired";
            System.out.println(e.getName() + " is: " + status);
        }
    } 
}
