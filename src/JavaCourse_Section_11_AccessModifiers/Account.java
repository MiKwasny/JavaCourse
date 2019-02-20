package JavaCourse_Section_11_AccessModifiers;

import java.util.ArrayList;

public class Account {

    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance +=amount;
            System.out.println("Balance is now: "+ this.balance);
        }else{
            System.out.println("Cannot deposit negative sum");
        }

        }

    public void withdraw(int amount){
        int withdrawal = -amount;

        if(withdrawal<0){
            this.transactions.add(withdrawal);
            this.balance +=withdrawal;
            System.out.println("balance is now: "+this.balance);
        }else{
            System.out.println("Cannot withdraw a negative sums");
        }
    }

    public void calculateBalance(){
        this.balance =0;
        for(int i : this.transactions){
            this.balance +=i;
            System.out.println("Current balance: "+this.balance);
        }

    }
}
