package com.locker;

import java.io.File;

public class SearchFile extends UserInterface implements Locker {
	
	public void doOperation()
	{
		file=new File(filePath);
		String[] fileList=file.list();
		
		if(fileList.length>0)
		{
			String fileName=getFileName();
			boolean isFile=false;
			int len=fileName.length();	
			int fileCode=fileName.hashCode();
			for(String file:fileList)
			{
				if(file.length()==fileName.length())
				{
					if(file.hashCode()==fileCode)
					{
						int count=0;
						int i=0;
					
						while(i<len)
						{
							if(file.charAt(i)==fileName.charAt(i))
							{
								count+=1;
							}
							else
							{
								break;
							}
							i++;
						}
						if(count==len)
						{
							isFile= true;
						}
					
					}
				
				}
			
			}
		
			if(isFile)
			{
			System.out.println("File is present in the folder");
			}
		
			else
			{
				System.out.println("File is not present in the folder");
			}
		
		}
		else
		{
			System.out.println("Folder is empty");
		}
	}


}

