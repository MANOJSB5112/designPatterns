package DesignPatterns.Adapter;

public class IciciBankAdapter implements BankApiInterface{
    private  IciciBank ib=new IciciBank();
    @Override
    public void sendMoney(int amount, String from, String to) {
        ib.sendMoney(amount,from,to);
    }

    @Override
    public void getBalance(String accountNumber) {
        ib.getBalance(accountNumber);
    }

    @Override
    public void createAccount(String name) {
        ib.createAccount(name);
    }
}
