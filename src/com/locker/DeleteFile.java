package com.locker;

import java.io.File;

public class DeleteFile extends UserInterface implements Locker {
	
public void doOperation() {
		
		String fileName=getFileName();
		file=new File(filePath+fileName);
		if(file.delete())
		{
			System.out.println("File is deleted");
		}
		else
		{
			System.out.println("File doesn't exist");
		}
	}

}

