package review_oop.oop_java_1.exercises2;

public class Main {
    public static void main(String[] args) {
        Account account= new Account(123456, "Huy");
        Account account2= new Account(654321, "Cong");
        account.recharge();
        System.out.println(account);
        account.withdrawal();
        System.out.println(account);
        account.transfer(account2);
        account.expiredDate();
        System.out.println(account);
        System.out.println(account2);

    }
}
