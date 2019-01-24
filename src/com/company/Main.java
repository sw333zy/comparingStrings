package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("How is the weather?");
	System.out.println(" Enter rain, wind, snow, or something else");
	String answer = scan.nextLine();
	/* ObjectA == ObjectB returns true ONLY when both share the same memory location.
	The same is true with ObjectA.equals(ObjectB) Strings are different StringA will only return TRUE to
	StringB when the syntax is stringA.equals(StringB) do NOT use == for strings*/
	if (answer.equals("rain"))
	    System.out.println("Take your umberella!");
	else if (answer.equals("windy"))
	    System.out.println("Wear your jacket!");
	else if (answer.equals("snow"))
	    System.out.println("Wear a coat and take a shovel!");
	else
	    System.out.println("Enjoy your day!");
    }
}
