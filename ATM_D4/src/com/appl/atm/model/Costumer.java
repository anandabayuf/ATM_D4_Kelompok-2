/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author ASUS X505Z
 */
public abstract class Costumer implements AccountInterface{

    private int accountNumber;
    private int pin; 
    private double availableBalance; 
    private double totalBalance; 
    
    public Costumer(int accountNumber, int pin,double availableBalance, double totalBalance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }
    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }


    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }


    public double getTotalBalance() {
        return totalBalance;
    }


    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    
    public void credit(double amount) {
      totalBalance+=amount;
   }
   
   public void credit2(double amount) {
      availableBalance+=amount;
      totalBalance+=amount;
   }
   
   public void debit(double amount) {
        availableBalance-=amount;
        totalBalance-=amount;
   }
   
   @Override
    public boolean authenticatePin(int inputPin){
        return (this.pin==inputPin);
    }
}
