import java.util.Scanner;

public class Account {
    Scanner sc=new Scanner(System.in);
    private double checkingBalance=0;
    private double savingBalance=0;
    private int customerNumber;
    private int pinNumber;
     public void setCustomerNumber(int customerNumber){
         this.customerNumber=customerNumber;
     }
     public void setPinNumber(int pinNumber){
         this.pinNumber=pinNumber;
     }
     public int getCustomerNumber(){
         return customerNumber;
     }
     public int getPinNumber(){
         return pinNumber;
     }
     public double getCheckingBalance(){
         return checkingBalance;
    }
    public double getSavingBalance(){
         return savingBalance;
    }
     public void calculateCheckingBalanceWithDraw(double amount ){
         checkingBalance=checkingBalance-amount;
     }
     public void calculateSavingBalanceWithDraw(double amount){
         savingBalance=savingBalance-amount;
     }
    public void calculateCheckingBalanceDeposit(double amount ){
        checkingBalance=checkingBalance+amount;
    }
    public void calculateSavingBalanceDeposit(double amount){
        savingBalance=savingBalance+amount;
    }
    public void getCheckingBalanceWithDrawInput(){
        System.out.print("Checking Account Balance in Rupees : "+checkingBalance);
        System.out.println("\nEnter the amount you want to withdraw from your checking account");
        System.out.print("Amount : ");
        double amount=0;
        int temp=0;
        try {
            amount=sc.nextDouble();
        }catch (Exception e){
            System.out.println("Invalid Input");
            temp++;
        }
        System.out.println(" ");
        if(temp==0) {
            if (checkingBalance == 0) {
                System.out.println("You have 0 Balance in your Checking Account you can not withdraw money");
            } else {
                if (checkingBalance - amount >= 0) {
                    calculateCheckingBalanceWithDraw(amount);
                    System.out.print("New Checking Account Balance is : ");
                    System.out.println(checkingBalance);
                } else {
                    System.out.println("Balance can not be Negative");
                    getCheckingBalanceWithDrawInput();
                }
            }
        }
    }
    public void getSavingBalanceWithDrawInput(){
        System.out.print("Saving Account Balance in Rupees : "+savingBalance);
        System.out.println("\nEnter the amount you want to withdraw from your saving account");
        System.out.print("Amount : ");
        double amount=0;
        int temp=0;
        try {
            amount=sc.nextDouble();
        }catch (Exception e){
            System.out.println("Invalid Input");
            temp++;
        }
        System.out.println(" ");
        if(temp==0) {
            if (savingBalance == 0) {
                System.out.println("You have 0 Balance in your Saving Account you can not withdraw money");
            } else {
                if (savingBalance - amount >= 0) {
                    calculateSavingBalanceWithDraw(amount);
                    System.out.print("New Saving Account Balance is : ");
                    System.out.println(savingBalance);
                } else {
                    System.out.println("Amount can not be negative");
                    getSavingBalanceWithDrawInput();
                }
            }
        }
    }
    public void getCheckingBalanceDepositInput(){
        System.out.print("Checking Account Balance in Rupees : "+checkingBalance);
        System.out.println("\nEnter the amount you want to deposit in your checking account");
        System.out.print("Amount : ");
        double amount=0;
        int temp=0;
        try {
            amount=sc.nextDouble();
        }catch (Exception e){
            System.out.println("Invalid Input");
            temp++;
        }
        System.out.println(" ");
        if(temp==0) {
            if (checkingBalance + amount >= 0) {
                calculateCheckingBalanceDeposit(amount);
                System.out.print("New Checking Account Balance is : ");
                System.out.println(checkingBalance);
            } else {
                System.out.println("Balance can not be negative");
                getCheckingBalanceDepositInput();
            }
        }
    }
    public void getSavingBalanceDepositInput(){
        System.out.print("Saving Account Balance in Rupees : "+savingBalance);
        System.out.println("\nEnter the amount you want to deposit in your saving account");
        System.out.print("Amount : ");
        double amount=0;
        int temp=0;
        try {
            amount=sc.nextDouble();
        }catch (Exception e){
            System.out.println("Invalid Input");
            temp++;
        }
        System.out.println(" ");
        if(temp==0) {
            if (savingBalance + amount >= 0) {
                calculateSavingBalanceDeposit(amount);
                System.out.print("New Saving Account Balance is : ");
                System.out.println(savingBalance);
            } else {
                System.out.println("Balance can not be negative");
                getSavingBalanceDepositInput();
            }
        }
    }
}
