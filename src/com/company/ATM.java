package com.company;

public class ATM extends  Account {
    public ATM(int acNo, String uname, String pin, int balance) {
        super(acNo, uname, pin, balance);
    }

    public ATM (){
        System.out.println("Bank Account");

    }

    @Override
    public void makeDeposit(int depositAmount) {
        System.out.println("Enter the deposit amount in $ ");
        super.makeDeposit(depositAmount);
    }

    @Override
    public void setUsername(String name) {
        System.out.println("Enter user name");
        super.setUsername(name);
    }

    @Override
    public void setPin(String pin) {
        System.out.println("Enter your account number");
        super.setPin(pin);
    }

    @Override
    public void setAccountno(int ac) {
        System.out.println("Enter your account number");
        super.setAccountno(ac);
    }

}
