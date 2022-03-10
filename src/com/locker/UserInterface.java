package com.locker;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class UserInterface {
	public Scanner userInput;
	public File file;
	private int option;
	static final String filePath="c://LockedMe/Locker/";
	
	public UserInterface()
	{
		file=new File(filePath);
		file.mkdirs();
	}
	
	public void setInput()
	{
		try
		{
			userInput=new Scanner(System.in);
			System.out.println("\nEnter your option from above");
			option=userInput.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input: "+e);
			setInput();
		}
	}
	
	public int getInput()
	{
		setInput();
		return option;
	}
	
	public String getFileName()
	{
		userInput=new Scanner(System.in);
		System.out.println("Enter the filename");
		return userInput.nextLine();
	}


}
