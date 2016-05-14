/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;

/**
 *
 * @author sakib
 */
public class BankAccount extends Account {
    private String bankName;
    private double balance;
    
    BankAccount(int accountNumber, String holdername, String holdertype, String name, double baln)
    {
        super(accountNumber, holdername, holdertype);
        bankName=name;
        balance=baln;
    }
    
    public void setDeposit(double depos)
    {
        balance=balance+depos;
    }
    
    public void setDraw(double withamn)
    {
        balance=balance-withamn-withamn*0.05;
    }
    public void setCheck(double amount)
    {
        balance=balance-amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
    
}
