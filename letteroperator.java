package lab1;

import java.util.Scanner;

public class letteroperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
	    int a = Integer.parseInt(input.nextLine());
		System.out.println("Enter a number:");
	    int b = Integer.parseInt(input.nextLine());
	    System.out.println("Enter a number:");
	    String op = input.nextLine();
	    if (op.equals("A")) {
	    	System.out.println(a + b);
	    } else if (op.equals("S")) {
	    	System.out.println(a - b);
	    } else if (op.equals("M")) {
	    	System.out.println(a * b);
	    } else if (op.equals("D")) {
	    	System.out.println(a / b);
	    }
	}
}
