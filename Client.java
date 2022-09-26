package com.cg.client;

import com.cg.BankAplication.CurrentAcc;
import com.cg.BankAplication.SavingAcc;
import com.cg.applications.MMBankFactory;
import com.cg.applications.MMCurrentAcc;
import com.cg.applications.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		MMBankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101,"VAISHNAVI JIWANKAR",25000,true);
		CurrentAcc c=new MMCurrentAcc(102,"ADITYA JIWANKAR",25000,2500);
		System.out.println("SAVING ACCOUNT : ");
		s.withdraw(12000);
		System.out.println("CUREENT ACCOUNT : ");
		c.withdraw(10000);
		
		System.out.println(s);
		System.out.println(c);
		
	}

}