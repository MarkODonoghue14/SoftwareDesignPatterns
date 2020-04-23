package com.bank.loan;

public class LongTermLoan implements LoanBehaviour {
	
	private static final double LOWER_INTERESTRATE = 0.09;
	private static final double HIGHER_INTERESTRATE = 0.15; 
	

	public double calculateInterestOnLoanByTerm(int term, double loanAmount) {
	    if(term <= 15) {
	    	double interestAmount = (loanAmount * LOWER_INTERESTRATE);
	    	return interestAmount;
	    	 
	    }  
	    else {
	    	double interestAmount = (loanAmount * HIGHER_INTERESTRATE);
	    	return interestAmount;
	    }
    }
}
