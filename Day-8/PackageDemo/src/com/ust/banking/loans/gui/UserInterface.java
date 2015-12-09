package com.ust.banking.loans.gui;

import com.ust.banking.loans.helper.LoanHelper;

public class UserInterface {

	public static void main(String[] args) {
		System.out.println("This is Loan GUI...");
		LoanHelper loanHelper = new LoanHelper();
		loanHelper.loanLogic();
		

	}

}
