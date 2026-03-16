import java.util.Scanner;

public class App {

    static int balance = 1000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            if(choice==1){
                System.out.println("Enter amount:");
                int amt=sc.nextInt();
                balance+=amt;
            }

            else if(choice==2){
                System.out.println("Enter amount:");
                int amt=sc.nextInt();
                balance-=amt;
            }

            else if(choice==3){
                System.out.println("Balance = "+balance);
            }

            else{
                break;
            }
        }
    }
}