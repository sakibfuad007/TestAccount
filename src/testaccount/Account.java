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
public class Account {
    private int accountNumber;
    private String holderName;
    private String holderType;
    Account(int a, String name, String type)
    {
        accountNumber=a;
        holderName=name;
        holderType=type;
    }
}
