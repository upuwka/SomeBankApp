import controler.Bank;
import entity.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner enterName = new Scanner(System.in);
        System.out.println("Your User Name: ");
        String name  = enterName.nextLine();

        Scanner enterPassword = new Scanner(System.in);
        System.out.println("Enter your password: ");
        int password  = enterPassword.nextInt();

        User user = new User("0000125662", -50.00,"Irene Eva","female", 7894);
        Bank bank = new Bank ();
        bank.setActiveUser(user);
        bank.getUserBalance();

        if (user.balance >= 0 ){
        System.out.println("Welcome to the Bank " + user.name + "!" + " You can withdraw or debit your account!");}
        else if (user.balance < 0 ){
            System.out.println("Welcome to the Bank " + user.name + "!" +" \nWarning! You have negative account!");
            System.out.println();}

        System.out.println("Current balance " + bank.getUserBalance());

        String response = bank.creditUser(200.50);
        System.out.println(response);
        System.out.println("Current balance " + bank.getUserBalance());

        String response1 = bank.debditUser(20.50);
        System.out.println(response1);
        System.out.println("Current balance " + bank.getUserBalance());

    }
}
