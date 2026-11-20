import java.util.Scanner;
class Main {
public static double Currentbalance = 2500.75d;
public static int Depositcount = 0;
public static int Withdrawcount = 0;
public static void DisplayMenu(){
    System.out.println("========= ATM =========");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Show Account Status");
    System.out.println("5. Exit");
    System.out.println("=======================");
}

public static boolean Login(){
       boolean isSuccess=false;
       int attempts=0;
    Scanner scanner = new Scanner(System.in);
do {
    System.out.println("Enter 4-digit PIN");
    String pin = scanner.nextLine();
    
    if (pin.equals("1234")) {
        isSuccess = true;
        break;
    } else {
        System.out.println("invalid pin code.");
    }
    
    attempts++;
} while (attempts < 3);
    return isSuccess;
}

public static void CheckBalance(){
  System.out.println("Your current balance is: "+Currentbalance);
}
public static void Deposit(){
System.out.println("Please, enter a valid amount greater than zero");
     Scanner scanner = new Scanner(System.in);
    double amount = scanner.nextDouble();
    if(amount <=0){
        System.out.println("Invalid amount.");
    }
    else{
        Currentbalance+=amount;
        Depositcount++;
        System.out.println("Your current balance is: "+Currentbalance);
    }
}
public static void Withdraw(){
    System.out.println("Please, enter a valid amount greater than zero and not exceed the balance.");
    Scanner scanner = new Scanner(System.in);
    double amount = scanner.nextDouble();
    if(amount <=0){
        System.out.println("Transaction cancelled.");
    }
    else if(amount > Currentbalance){
        System.out.println("Insufficient balance.");
    }
    else{
        Currentbalance-=amount;
        Withdrawcount++;
        System.out.println("Your current balance is: "+Currentbalance);
    }
    
}
    public static void ShowAccountStatus(){
        if(Currentbalance<1000d)
                 System.out.println("Low Balance.");
        else if(Currentbalance>=1000d && Currentbalance <= 4999.99d)
                 System.out.println("Regular Customer.");
        else if(Currentbalance>=5000d)
                 System.out.println("VIP Customer.");
    }
    public static void main(String[] args) {
        boolean succsess = Login();
        if(succsess){
        boolean display=true;
        while(display){
           if(Currentbalance==0)
            System.out.println("Warning: Your account is empty.");
          DisplayMenu();
          System.out.println("Please, Select option Number");
          Scanner scanner = new Scanner(System.in);
          int option = scanner.nextInt();
            switch (option) {
            case 1 -> CheckBalance();
            case 2 -> Deposit();
            case 3 -> Withdraw();
            case 4 -> ShowAccountStatus();
            case 5 -> display=false;
            default -> System.out.println("Invalid option");
             }
        }
    System.out.print("Total successful transactions of deposit is: "+ Depositcount+ " and withdrawal is: "+ Withdrawcount);
        }
        else{
         System.out.println("Your account has been locked.");
        }
     
    }
}
