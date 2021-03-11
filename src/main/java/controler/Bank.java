package controler;

import entity.User;

public class Bank {
    private User user;
    public String setActiveUser(User user){
        this.user = user;
        return "user update succsesfull ";
    }

    public double getUserBalance() {
        return user.getBalance();
    }
    public String creditUser(double amount){
        double newBalance = user.getBalance() + amount;
        this.user.setBalance(newBalance);
        return amount  + " EUR added to your balance";
    }
    public String debditUser(double amount){
        double newBalance = user.getBalance() - amount;
        this.user.setBalance(newBalance);
        return amount  + " EUR was deducted from your balance";
    }

}

