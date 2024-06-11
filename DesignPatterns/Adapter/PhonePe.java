package DesignPatterns.Adapter;

import inheritance.B;

public class PhonePe {

    public static void main(String[] args) {
       BankApiInterface ba=new HdfcBankApiInterface();
        ba.sendMoney(1000,"manoj","chethan");
        ba.createAccount("Radha");
        ba.getBalance("1018210");
    }
}
