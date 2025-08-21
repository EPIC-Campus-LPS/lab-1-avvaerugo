package lab1;

import java.util.Scanner;

public class passwordchecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Username:");
	    String username = input.nextLine();
	    System.out.println("Password:");
	    String password = input.nextLine();
	    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234password")) {
	    	System.out.println("Login successful :3");
	    } else {
	    	System.out.println("you have commited unmistakable atrocities, and you will be punished accordingly >:3 (you messed up the login)");
	    }
	}
}
