/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatesii
 * and open the template in the editor.
 */
package testaccount;

/**
 * @author sakib
 */
public class DepositAccount extends BankAccount {
    private double depositAmount;
    private int countChecks;
    
    DepositAccount(int accno, String holdername,String holdertype, String bankname,double balance, int count)
    {
        super(accno, holdername, holdertype, bankname, balance);
       // depositAmount=depos;
        countChecks=count;
    }
    
    public void setDeposit(double depos)
    {
        depositAmount=depos;
        if(super.getBalance()<20000)
        {
            super.setDeposit(depositAmount);
        }
        else
        {
            super.setDeposit(depositAmount+depositAmount*0.05);
        }
           
    }
    
    public void checkFee()
    {
        if(super.getBalance()<10000)
        {
            System.out.println("You are charged with 100 taka fee!!!");
        }
    }
}
