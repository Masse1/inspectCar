package se.kth.iv1350.inspectcar.view;

import java.util.List;
import java.util.Scanner;
import se.kth.iv1350.inspectcar.controller.Controller;
import se.kth.iv1350.inspectcar.integration.InspectionItem;

/**
 * This class is a placeholder for the view.
 */
public class View {

    private Controller contr;

    /**
     * Creates a new instance that will use the specified controller for all
     * system operations.
     *
     * @param contr The controller to use for system operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * Calls all system operations and prints the result to
     * <code>System.out</code>.
     */
    public void sampleExecution() {
        Scanner sc = new Scanner(System.in);
        String regNoOfVehicleToInspect = "ABC123";
        int cost = contr.enterRegNo(regNoOfVehicleToInspect);

        List<InspectionItem> reginpec = contr.getInspecion();

        for (InspectionItem e : reginpec) { 
            System.out.println(e.getName());
            boolean partPassed = sc.nextBoolean();
            if (partPassed) {

                e.setResult(true);
                contr.addPayment(e.getCost());
                
            }
            else {
            e.setResult(false);
            }

        }

        for (int i = 0; i < reginpec.size(); i++) {

            contr.storeResult(reginpec.get(i));
        }
        
        
        
        if (contr.authorize()){
          
        contr.printResult(reginpec, contr.getPayment(), contr.getBalance());
        }
        

        contr.addBalance(cost);
        System.out.println("Current value in counter is now: " + contr.getBalance() + " Kr");
    }

}
