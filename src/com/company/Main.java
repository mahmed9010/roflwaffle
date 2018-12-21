package com.company;

public class Main {

    public static void main(String[] args) {
	    Digits d1 = new Digits(7);
	    System.out.println(d1.isStrictlyincreasing());

	    Digits d2 = new Digits(65310);
	    System.out.println(d2.isStrictlyincreasing());

	    System.out.println(new Digits(1356).isStrictlyincreasing());
        System.out.println(new Digits(1336).isStrictlyincreasing());
        System.out.println(new Digits(1536).isStrictlyincreasing());

        System.out.println(d2.getDigitList());
    }
}
