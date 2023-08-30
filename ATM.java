import java.util.Scanner;
public class ATM{
    UserBankAccount uba= new UserBankAccount();
    Scanner scan = new Scanner(System.in);
    
    public ATM() {
        do{
            System.out.println("1.with Draw amount \n2.deposit Amount \n3.Check Balance \n4.Exit \nEnter your choice");
            switch (scan.nextInt()) {
                case 1:
                    withDraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    return;
                default:System.out.println("enter valid option");
                    break;
            }
        }while(true);
    }
    void withDraw(){
        System.out.println("enter the amount");
        double amount=scan.nextDouble();
        if(amount>uba.getAmount()){
            System.out.println("you don't have sufficient balance to withdraw "+amount);
            return;
        }
        uba.setAmount(amount*-1);
        System.out.println("successfully withdrawn amount "+ amount);
    }
    void deposit(){
        System.out.println("enter the amount");
        double amount=scan.nextDouble();
        uba.setAmount(amount);
        System.out.println("successfully deposited amount "+ amount);
    }
    void checkBalance(){
        System.out.println("your current balance is "+uba.getAmount());
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO ATM");
        new ATM();
        System.out.println("THANK YOU FOR COMING");
    }
}