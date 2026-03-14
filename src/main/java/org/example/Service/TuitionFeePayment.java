package org.example.Service;

public class TuitionFeePayment {
    private final double pricePerUnit = 1000.00;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){
        totalTuition = units * pricePerUnit;
        if (discountRate !=0){
            totalTuition = totalTuition - (totalTuition * discountRate);

        }
        return totalTuition;
    }

    public void makePayment(double amount){
        balance = totalTuition - amount;
        if (balance < 0); {
            balance = 0;
        }


    }

    public double getRemainingBalance(){

        return balance;
    }
    public boolean isFullyPaid(){
       return balance == 0 ? true : false;
       }
    }

