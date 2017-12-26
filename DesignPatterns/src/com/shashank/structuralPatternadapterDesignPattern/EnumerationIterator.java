package com.shashank.structuralPatternadapterDesignPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

	public EnumerationIterator(Enumeration enumeration) {

		this.enumeration = enumeration;
	}

	Enumeration enumeration;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
