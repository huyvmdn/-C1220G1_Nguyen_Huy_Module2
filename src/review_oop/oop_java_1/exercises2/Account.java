package review_oop.oop_java_1.exercises2;

import java.util.Scanner;

public class Account {
    private long number;
    private String name;
    private double money;
    private final double interestRate = 0.035;
    private final double fees = 0.5;

    public Account() {
    }

    public Account(long number, String name, double money) {
        this.number = number;
        this.name = name;
        this.money = money;
    }

    public Account(long number, String name) {
        this.number = number;
        this.name = name;
        this.money = 50;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getFees() {
        return fees;
    }

    public double check() {
        Scanner sc = new Scanner(System.in);
        double n = 0.0d;
        boolean check = false;
        while (!check) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if(n>0 ){
                    check = true;
                } else  {
                    System.err.println("the amount you want recharge >0");
                }
            } catch (Exception e) {
                System.err.println("wrong type data \n retype : ");
            }
        }
        return n;
    }
    public double checkWithdrawal() {
        Scanner sc = new Scanner(System.in);
        double n = 0.0d;
        boolean check = false;
        while (!check) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if(n>0 && this.getMoney()>=(n+fees)){
                    check = true;
                } else  {
                    System.err.println("the amount you want Withdrawal >0 & <"+(this.getMoney()-fees));
                }
            } catch (Exception e) {
                System.err.println("wrong type data \n retype : ");
            }
        }
        return n;
    }

    public double recharge() {
        System.out.print("the amount you want recharge: ");
        double recharge = check();
        this.money += recharge;
        return this.money;
}


    public double withdrawal() {
        System.out.println("the amount you want Withdrawal: ");

        double Withdrawal =checkWithdrawal();
        this.money -= (Withdrawal + fees);
        return this.money;
    }

    public double expiredDate() {
        this.money += this.money * interestRate;
        return this.money;
    }
    public double checkTransfer() {
        Scanner sc = new Scanner(System.in);
        double n = 0.0d;
        boolean check = false;
        while (!check) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if(n>0 && n<(this.getMoney()+fees) && this.money>fees){
                    check = true;
                } else  {
                    System.err.println("the amount you want transfer >0 & < "+this.getMoney()+" \n retype : ");
                }
            } catch (Exception e) {
                System.err.println("wrong type data \n retype : ");
            }
        }
        return n;
    }
    public void transfer(Account account) {
        System.out.print("the amount you want transfer: ");
        double transfer = checkTransfer();
        account.setMoney(account.getMoney()+transfer);
        this.money-=(transfer+fees);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", interestRate=" + interestRate +
                '}';
    }

}
