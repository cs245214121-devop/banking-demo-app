public class BankingApp {
    public static void main(String[] args) {
        int balance = 1000;

        System.out.println("Welcome to Banking Demo App");
        System.out.println("Initial Balance: " + balance);

        balance = deposit(balance, 500);
        balance = withdraw(balance, 200);

        System.out.println("Final Balance: " + balance);
    }

    public static int deposit(int balance, int amount) {
        return balance + amount;
    }

    public static int withdraw(int balance, int amount) {
        return balance - amount;
    }
}