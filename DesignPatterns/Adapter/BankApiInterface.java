package DesignPatterns.Adapter;

public interface BankApiInterface {
    public void sendMoney(int amount,String from,String to);

    public void getBalance(String accountNumber);

    public void createAccount(String name);
}
