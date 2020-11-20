package com.demo.cli;



public class SetOutput {
	//PrintWriter out=resp.getWriter();
	public static void printRepaySched1(double loanAmt){
		System.out.println("\n \t\t\t\t Repayment Schedule ");
		System.out.println(" \t\t\t----------------------------------\n");
		System.out.println("Rental No\tRental Value\tInterest Amount\t	Capital Amount\t   Capital Balance");
		System.out.println("0 \t\t 0 \t\t\t 0 \t\t 0 \t\t\t " + loanAmt);
	}
	
	public static void printRepaySched2(int i,double instalmentVal,double interestAmt,double capitalAmt,double capitalBalnce){
		System.out.println(i +"\t\t" + instalmentVal + "\t\t" + interestAmt + "\t\t" + capitalAmt + "\t\t" + capitalBalnce);
	}
	
}
