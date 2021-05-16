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

        int secondScore = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (secondScore >= 1000 && secondScore < 5000) {
			System.out.println("Your score was between 1000 and 5000");
		}
        else if (secondScore < 1000) {
			System.out.println("Your score was under 1000");
		} else {
			System.out.println("Nice job! You scored over 5000!");
		}

        int finalScore = secondScore + levelCompleted * bonus;
		System.out.println("Your final score is " + finalScore);
    }
}
