package org.example.Service;

public class TuitionFeePayment {

    private final double pricePerUnit = 1000.00;

    private double balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate){


        totalTuition = units * pricePerUnit;

        if (discountRate != 0){
            totalTuition -= (totalTuition * discountRate);
        }

        balance = totalTuition;

        return totalTuition;
    }

    public double applyScholarshipDiscount(String scholarshipType){

        if (scholarshipType.equalsIgnoreCase("Academic")){

            totalTuition = totalTuition * 0.50;

        } else if (scholarshipType.equalsIgnoreCase("Athletic")){

            totalTuition = totalTuition * 0.75;
        }

        balance = totalTuition;

        return totalTuition;
    }

    public void makePayment(double amount){

        if (amount < 0){
            System.out.println("Invalid payment amount.");
            return;
        }

        balance -= amount;

        if (balance < 0){
            balance = 0;
        }
    }

    public double getRemainingBalance(){
        return balance;
    }

    public boolean isFullyPaid(){
        return balance == 0;
    }
}