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
public class StudentAccount extends Account {
    private String institute;
    private String status;
    
    StudentAccount(int accnum, String holdername, String holdertype, String ins, String stat)
    {
        super(accnum, holdername, holdertype);
        institute=ins;
        status=stat;
    }
    
}
