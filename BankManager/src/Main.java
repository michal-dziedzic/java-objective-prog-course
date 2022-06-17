import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CheckingAccount TomAccount = new CheckingAccount();
        TomAccount.account = "1523-52256-adf-1";
        TomAccount.balance = 1000;
        TomAccount.limit = 2000;

        long timestamp = 1632516399; 
        Date date = new Date(timestamp);
        COD MarkAccount = new COD();
        MarkAccount.account = "1258-3657-asd";
        MarkAccount.balance = 2000;
        MarkAccount.expiry = date;

        SavingsAccount ErikAccount = new SavingsAccount();
        ErikAccount.account = "1552-456-sda4-s5fds";
        ErikAccount.balance = 15623;
        ErikAccount.transfers = 150;

        System.out.println(TomAccount.account + " " + TomAccount.balance + " " +TomAccount.limit);
        System.out.println(MarkAccount.account + " " + MarkAccount.balance + " " + MarkAccount.expiry);
        System.out.println(ErikAccount.account + " " + ErikAccount.balance + " " + ErikAccount.transfers);
    }
}