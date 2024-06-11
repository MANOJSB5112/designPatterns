package DesignPatterns.Adapter;

public class IciciBank {


    int balance=1000;
    public void sendMoney(int amount,String from,String to)
    {
        System.out.println("Sent Money of amount Rs "+amount+" from "+ from +" to "+to+" through Icici Bank");
    }

    public void getBalance(String accountNumber)
    {
        System.out.println("The available balance in IciciBank is "+balance);
    }

    public void createAccount(String name){
        System.out.println("Acount is created with the name"+name+" in Icici Bank");
    }
}
