package org.apache.maven.archetypes.JunitBank;
public class Bank {

    private int balance;
    private int account;
    private String name;
    private String email;

    public Bank(int account, String name, String email, int balance) {
        this.account = account;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

   
    public void withdraw(int amount) {
    	if (amount > 0 && (balance - amount) >= 1500) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

   
    @Override
    public String toString() {
        return "Bank{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}