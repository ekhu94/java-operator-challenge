package com.ekhu94;

public class Main {

    public static void main(String[] args) {
	    double myDouble = 20.00;
	    double mySecondDouble = 80.00;
	    double doubleSum = (myDouble + mySecondDouble) * 100.00;
	    double doubleRemainder = doubleSum % 40.00;
	    boolean isZero = doubleRemainder == 0;
        System.out.println(isZero);
        if (!isZero) {
			System.out.println("Got some remainder");
		}
    }
}
