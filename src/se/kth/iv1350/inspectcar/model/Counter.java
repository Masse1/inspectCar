/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectcar.model;

/**
 *
 * @author Kristoffer
 */
public class Counter {

    private int balance;
    private int customerPayment = 0;

    public Counter(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void addPayment(int cost) {
        customerPayment += cost;

    }

    public void addBalance(int cost) {
        balance = balance + customerPayment;
        customerPayment=0;
    }

    

    public int getPayment() {
       return customerPayment;
    }
}
