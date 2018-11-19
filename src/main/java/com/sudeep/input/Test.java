package com.sudeep.input;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Test {

	int a;
	Stack<Integer> b = new Stack<Integer>();
	//ArrayList<E> c;
	HashSet<Integer> d;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	

}
