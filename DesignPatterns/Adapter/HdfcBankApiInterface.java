package DesignPatterns.Adapter;

public class HdfcBankApiInterface implements BankApiInterface{
  private HdfcBank hb=new HdfcBank();
    @Override
    public void sendMoney(int amount, String from, String to) {
        hb.sendMoney(amount,from,to);
    }

    @Override
    public void getBalance(String accountNumber) {
        hb.getBalance(accountNumber);
    }

    @Override
    public void createAccount(String name) {
        hb.createAccount(name);
    }
}
