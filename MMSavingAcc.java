package com.cg.applications;

import com.cg.BankAplication.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	@SuppressWarnings("unused")
	private static final float MINBAL = 0;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	@Override
	public String toString() {
		return String.format(
				"MMSavingAcc [toString()=%s]",
				super.toString());
	}

	
	
	

	
	
}
