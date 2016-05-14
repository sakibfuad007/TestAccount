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
public class SavingsAccount extends BankAccount {
    private double depositAmount;
    private double withdrawalAmount;
    private int passbookNo;
    
    SavingsAccount(int accno, String holdername, String holdertype, String bankname, double balance,  int no)
    {
        super(accno, holdername, holdertype, bankname, balance);
        passbookNo=no;  
    }
    
    public void setDeposit(double depos)
    {
        depositAmount=depos;
        super.setDeposit(depositAmount);
    }
    
    public void setDraw(double withD)
    {
        withdrawalAmount=withD;
        super.setDraw(withdrawalAmount); 
    }
    public void checkFee()
    {
        if(super.getBalance()<100)
        {
            System.out.println("You are chaged with 10 taka fee!!!");
        }
    }
}
