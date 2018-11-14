package com.sudeep.geekforgeeks.stack;

import java.util.Scanner;
import java.util.Stack;

public class BlancedWxpression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String exp = "()[{}]";
		Stack<Character> s = new Stack<Character>();
		boolean status = true;
		for(int i  = 0; i < exp.length();i++) {
			char c = exp.charAt(i);
			
			if(c == ')') {
				char ch = s.peek();
				if(ch == '(') {
					s.pop();
				}
			}
			else  if(c == ']') {
				char ch = s.peek();
				if(ch == '[') {
					s.pop();
				}
			}
			
			else  if(c == '}') {
				char ch = s.peek();
				if(ch == '{') {
					s.pop();
				}
			}
			else {
				s.push(c);
			}
			
		}
		if(s.empty()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
		
		
		
		
		

	}

}
