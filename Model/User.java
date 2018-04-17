package Model;

import java.util.Scanner;

public class User
{
	Scanner userInput = new Scanner(System.in);
	String storedUsername, storedPassword;
	int validLogin = 0;
	int invalidLogin = -1;

	do
	{
		System.out.print("Enter your username: ");
		storedUsername = userInput.nextLine();
		System.out.print("Enter your password: ");
		storedPassword = userInput.nextLine();
		invalidLogin++;
	}while(!"pratiksh".equals(storedUsername)||!"prat1234".equals(storedPassword));

	System.out.printf("\nWelcome %s; you have sucesfully logged into your account ",storedUsername);

	validLogin++;System.out.printf("\nLogin History: InvalidAttempts = %d ; ValidAttempts = %d",invalidLogin,validLogin);

	}


}
