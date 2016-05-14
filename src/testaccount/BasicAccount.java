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
public class BasicAccount extends BankAccount {
    private double checkAmount;
    private static int countChecks;
    private int checkbookNo;
    
    BasicAccount(int accno, String holdername,String holdertype, String bankname, double balance, int cno)
    {
        super(accno, holdername, holdertype, bankname, balance);
        countChecks++;
        checkbookNo=cno;
    }
    
    public void setCheck(double checkamn)
    {
        checkAmount=checkamn;
        super.setCheck(checkAmount);
        countChecks++;
        if(countChecks>10)
        {
            System.out.println("You are charged with 10 taka fee!!!");
        }
    }
    
}
