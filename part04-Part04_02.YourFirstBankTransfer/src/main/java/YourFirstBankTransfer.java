
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account newMatthewsAccount = new Account("Matthews account", 1000);
        Account myNewAccount = new Account("My account", 0);
        newMatthewsAccount.withdrawal(100.0);
        myNewAccount.deposit(100.0);
        System.out.println(newMatthewsAccount);
        System.out.println(myNewAccount);
    }
}
