package com.ust.banking.loans.helper;

import com.ust.banking.loans.dao.LoanDAO;

public class LoanHelper {
	public void loanLogic(){
		System.out.println("This Contains the Loan Logic....");
		LoanDAO loanDAO = new LoanDAO();
		loanDAO.connectToDb();
	}
}
