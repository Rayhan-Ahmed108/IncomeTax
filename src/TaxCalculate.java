import java.util.Scanner;

public class TaxCalculate {

        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();
        double tax;
        public double calculateTax(){
           if(income > 1650000){
               income = income - 1650000;
               tax = tax+income * 0.25;
           }
           if(income > 1150000){
               income=income - 1150000;
               tax = tax+income * 0.20;
           }
           if(income > 750000){
               income = income - 750000;
               tax = tax+income * 0.15;
           }
           if(income > 450000){
               income = income - 450000;
               tax = tax+income * 0.10;
           }
           if(income > 350000){
               income = income - 350000;
               tax = tax+income * 0.05;
           }
           if(income > 350000){
               income = income - 350000;
               tax = tax+income * 0;
           }
           return tax;
           }

        }


