package se.kth.iv1350.inspectcar.controller;

import java.util.List;
import se.kth.iv1350.inspectcar.integration.DatabaseManager;
import se.kth.iv1350.inspectcar.integration.Garage;
import se.kth.iv1350.inspectcar.integration.InspectionItem;
import se.kth.iv1350.inspectcar.integration.Printer;
import se.kth.iv1350.inspectcar.model.Inspection;
import se.kth.iv1350.inspectcar.model.Vehicle;
import se.kth.iv1350.inspectcar.integration.PaymentAuthorization;
import se.kth.iv1350.inspectcar.model.Counter;

/**
 * This is the application's single controller. All calls to the model pass
 * through here.
 */
public class Controller {

    private DatabaseManager dbMgr;

    private Garage garage;
    private PaymentAuthorization auth;
    private Counter counter;

    /**
     * Creates a new instance using the specified database manager.
     *
     * @param dbMgr The database manager used for all database calls.
     * @param garage The garage manages to open/close the door and display Queue
     */
    public Controller(DatabaseManager dbMgr, Garage garage, PaymentAuthorization auth, Counter counter) {
        this.dbMgr = dbMgr;

        this.garage = garage;
        this.auth = auth;
        this.counter = counter;

        this.garage = garage;

    }

    public void newInspection() {
        garage.nextInspection();

    }

    public void closeDoor() {
        garage.closeDoor();
    }

    public List<InspectionItem> getInspecion() {
        // InspectionItem car= new InspectionItem();
        List<InspectionItem> inspecL = dbMgr.getDummyInsp();

        return inspecL;
    }

    /**
     * Verifies that there are inspections to perform for the vehicle with the
     * specified registration number. If there are inspections, returns the
     * total cost for the inspections. Returns 0 if there are no inspections to
     * perform. This will instead be indicated with an exception in a future
     * version.
     *
     * @param regNo The registration number of the vehicle to inspect.
     * @return The total cost for the inspections, or 0 if there are no
     * inspections to perform.
     */
    public int enterRegNo(String regNo) {
        Vehicle vehicle = new Vehicle(regNo);
        Inspection inspection = new Inspection(vehicle, dbMgr);
        return inspection.getCost();
    }

    public void storeResult(InspectionItem part) {

        dbMgr.storeResult(part);
    }

    public void printResult(List<InspectionItem> inspectionList , int cost, int balance) {
        Printer printer = new Printer();

        printer.printResult(inspectionList, cost );
    }

    public boolean authorize() {
        return auth.authorize();
    }

    public int getBalance() {
        return counter.getBalance();
    }

    public void addBalance(int amount) {
        counter.addBalance(amount);

    }

    public void addPayment(int cost) {
        counter.addPayment(cost);
    }

    public int getPayment() {
        return counter.getPayment();
    }
}
