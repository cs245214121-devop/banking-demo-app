public class App {

    static int balance = 1000;

    public static void main(String[] args) {

        System.out.println("Banking Application Started");
        System.out.println("Initial Balance = " + balance);

        deposit(500);
        withdraw(200);
        checkBalance();

        System.out.println("Application executed successfully inside Docker container");
    }

    static void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(int amount){
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    static void checkBalance(){
        System.out.println("Current Balance = " + balance);
    }
}