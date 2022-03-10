package com.locker;

import java.io.File;
import java.io.IOException;

public class AddFile extends UserInterface implements Locker {
	
	public void doOperation()
	{
		String fileName=getFileName();
		
		file=new File(filePath+fileName);
		try {
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error ocurred");
		}
		
	}


}

