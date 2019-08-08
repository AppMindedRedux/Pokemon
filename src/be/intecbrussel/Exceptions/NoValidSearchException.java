package be.intecbrussel.Exceptions;

import java.util.InputMismatchException;


public class NoValidSearchException extends InputMismatchException {

	public NoValidSearchException(String s) {

		super(s);
	}

}
