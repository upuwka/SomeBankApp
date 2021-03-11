package entity;

public class User {
    public String accountNumber;
    public double balance;
    public String name;
    public String gender;
    private int password;

    public User(String accountNumber, double balance, String name, String gender, int password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;
        this.password = password;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
