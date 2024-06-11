package DesignPatterns.Adapter;

public class HdfcBank {
    public void sendMoney(int amount,String from,String to)
    {
        System.out.println("Sent Money of amount Rs "+amount+" from "+ from +" to "+to+" through HDFC Bank");
    }

    public void getBalance(String accountNumber)
    {
        System.out.println("The available balance in HDFC Bank with "+accountNumber+" is "+1000);
    }

    public void createAccount(String name)
    {
        System.out.println("Acount is created with the name"+name+" in HDFC Bank");
    }
}
