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
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SavingsAccount ob1=new SavingsAccount(12567,"Sakib","Savings", "HSBC", 2000000, 102);
        System.out.println("------Savings Account------");
        ob1.setDraw(50000);
        System.out.println("Balance: "+ob1.getBalance());
        ob1.checkFee();
        ob1.setDeposit(10000);
        System.out.println("Balance: "+ob1.getBalance());
        ob1.checkFee();
        
        BasicAccount ob2= new BasicAccount(10987, "Saad", "Basic Account", "Standard Chartered Bamk", 50000, 780);
        System.out.println("------Basic Account------");
        ob2.setCheck(5050);
        System.out.println("Balance: "+ob2.getBalance());
        
        DepositAccount ob3=new DepositAccount(17867, "Pranto", "Deposit Account", "Sonali Bank", 300000, 3);
        System.out.println("-----Deposit Account------");
        ob3.setDeposit(5000);
        System.out.println("Balance: "+ob3.getBalance());
        ob3.checkFee();
        
    }
    
    
}
