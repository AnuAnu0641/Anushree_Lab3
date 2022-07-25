package com.balanceBracket.driver;
/*
 * Java program of Balancing Brackets, use a suitable data structure to print whether the string entered is a Balanced Brackets or Unbalanced Bracket
 * Input 1 : (([{{}]))    Output : The entered String has Balanced Brackets
 * Input 2 : ([[{}]]))	  Output : The entered Strings do not contain Balanced Brackets 
 */

import com.balanceBracket.services.BalanceBracket;

public class MainClass {

	public static void main(String[] args) {

		//String string1 = "([[{}]])".trim();
		String string2 = "([[{}]]))".trim();

		BalanceBracket obj = new BalanceBracket();
		boolean status = obj.checkBracketBalance(string2);

		if (status == true)
			System.out.println("The entered String has Balanced Brackets.");
		else
			System.out.println("The entered String does not contain Balanced Brackets.");
	}

}
