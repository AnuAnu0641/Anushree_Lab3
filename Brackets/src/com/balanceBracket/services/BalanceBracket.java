package com.balanceBracket.services;

import java.util.Iterator;
import java.util.Stack;

public class BalanceBracket implements IBalanceBracket {

	public boolean checkBracketBalance(String string) {

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		int length = string.length();

		if (length == 0)
			return false;
		else if ((string.length() % 2) != 0)
			return false;
		else {
			for (int i = 0; i < (length / 2); i++) {
				stack1.push(string.charAt(i));
				stack2.push(string.charAt(length - i - 1));
			}

			Iterator<Character> itr1 = stack1.iterator();
			while (itr1.hasNext()) {
				
				char ch1 = stack1.pop();
				char ch2 = stack2.pop();
				
				if (ch1 == '{' && ch2 != '}')
					return false;
				else if (ch1 == '[' && ch2 != ']')
					return false;
				else if (ch1 == '(' && ch2 != ')')
					return false;
				else
					continue;

			}
		}
		return true;
	}
}
