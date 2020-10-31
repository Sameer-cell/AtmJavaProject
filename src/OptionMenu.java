import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);
    int selector;
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() {
        int x = 1;
        do {
            try {
                data.put(12344568, 4445);
                data.put(76458897, 5555);
                data.put(24564456, 4545);
                data.put(23445651, 5458);
                data.put(42378945, 5442);
                data.put(24434570, 4765);
                data.put(25534547, 7825);
                data.put(23456445, 1215);
                data.put(23554501, 5576);
                data.put(23664575, 8985);
                data.put(23445454, 7865);
                data.put(61523555, 6655);
                data.put(24567345, 5672);
                data.put(12344500, 5475);
                data.put(26453452, 1455);
                data.put(23456453, 5113);
                data.put(98569545, 4565);
                data.put(95954545, 5555);
                data.put(88823475, 6895);
                data.put(66273459, 5123);
                data.put(12345667, 1234);
                data.put(23456789, 2345);
                System.out.println("Welcome to the ATM");
                System.out.print("Enter your Account Number : ");
                setCustomerNumber(sc.nextInt());
                System.out.print("Enter your Pin Number : ");
                setPinNumber(sc.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid Input");
                System.out.println("Enter a Number and Try Again");
                x = 2;
            }
            int temp = 0;
            if (x == 2) {
                temp = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.println("Wrong Customer Number or Pin Number\n");
            }

        } while (x == 1);
    }

    public void getAccountType() {
        try {
            System.out.println("\nSelect The Account You Want To Access");
            System.out.println("Type : 1 for Checking Account");
            System.out.println("Type : 2 for Saving Account");
            System.out.println("Type : 3 to Exit");
            System.out.print("Choice : ");
            selector = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println(" ");
        switch (selector) {
            case 1:
                getCheckingType();
                break;
            case 2:
                getSavingType();
                break;
            case 3:
                System.out.println("Thank you for using the ATM");
                break;
            default:
                System.out.println("Invalid Input");
                getAccountType();
        }
    }

    public void getCheckingType() {
        System.out.println("Type : 1 to Withdraw Money from Checking Account");
        System.out.println("Type : 2 to Deposit Money to Checking Account");
        System.out.println("Type : 3 to Check Balance");
        System.out.println("Type : 4 to Exit");
        try {
            System.out.print("Choice : ");
            selector = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println(" ");
        switch (selector) {
            case 1:
                getCheckingBalanceWithDrawInput();
                getAccountType();
                break;
            case 2:
                getCheckingBalanceDepositInput();
                getAccountType();
                break;
            case 3:
                System.out.println("Checking Balance in Rupees is : " + getCheckingBalance());
                getAccountType();
                break;
            default: {
                System.out.println("Invalid Input");
                getCheckingType();
            }
        }
    }

    public void getSavingType() {
        System.out.println("Type : 1 to Withdraw Money from Saving Account");
        System.out.println("Type : 2 to Deposit Money to Saving Account");
        System.out.println("Type : 3 to Check Balance");
        System.out.println("Type : 4 to Exit");
        try {
            System.out.print("Choice : ");
            selector = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(0);

        }

        System.out.println(" ");
        switch (selector) {
            case 1:
                getSavingBalanceWithDrawInput();
                getAccountType();
                break;
            case 2:
                getSavingBalanceDepositInput();
                getAccountType();
                break;
            case 3:
                System.out.println("Saving Balance in Rupees is : " + getSavingBalance());
                getAccountType();
                break;
            default: {
                System.out.println("Invalid Input");
                getSavingType();
            }
        }
    }
}
