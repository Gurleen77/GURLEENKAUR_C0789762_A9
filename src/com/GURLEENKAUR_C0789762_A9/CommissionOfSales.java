package com.GURLEENKAUR_C0789762_A9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CommissionOfSales {

    static double[] sales; //salesperson’s total monthly sales.
    static double[] advance; //amount of advanced pay the salesperson has drawn
    static double[] totalPayment; //amount of remaining commission or the amount to be reimburse by the salesperson
    static double commission=0; //amount of the commission


    public static void main(String[] args){
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner sc = new Scanner (System.in);
        System.out.println("Kindly enter the total number of Salespersons:");
        int salesPerson = sc.nextInt();
        sales = new double[salesPerson];
        advance = new double[salesPerson];
        totalPayment = new double[salesPerson];

        for(int i=0;i<salesPerson;i++){
            System.out.println("Kindly enter the monthly pay of "+(i+1)+ " salesperson:");
            sales[i]=sc.nextDouble();
            System.out.println("Enter the amount of advanced took by "+(i+1)+ " salesperson:");
            advance[i]=sc.nextDouble();
            commission =0;

            if(sales[i] < 10000)
                commission =sales[i]*0.5;
            else if(sales[i]>=10000 && sales[i]<15000)
                commission =sales[i]*0.10;
            else if(sales[i]>=15000 && sales[i]<18000)
                commission =sales[i]*0.12;
            else if(sales[i]>=18000 && sales[i]<22000)
                commission =sales[i]*0.15;
            else if(sales[i] >=22000)
                commission = sales[i]*0.16;
            totalPayment[i] = commission-advance[i];
        }
        for(int j=0;j<salesPerson;j++){
            System.out.println("Remaining commission/reimburse amount for "+(j+1)+" salesperson's is : " + df.format(totalPayment[j]));
        }
    }
}
