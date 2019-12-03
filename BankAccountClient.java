public class BankAccountClient {
    public BankAccountClient() {
    }

    public static void main(String[] var0) {
        double interest = .01;
        Bank account1 = new Bank("Hashbrown", "Burger", 42069, 100, 0.6);
        System.out.println(account1.toString());
        account1.addBalence(account1);
        System.out.println("Bank after adding " + interest + "is " + account1);
        account1.interest(balence);
        System.out.println("After Interest = " + account1);
    }
}
