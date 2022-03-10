package com.locker;

import java.io.File;
import java.util.PriorityQueue;

public class SortFile extends UserInterface  implements Locker {
	
	public void doOperation()
	{
		file=new File(filePath);
		String[] fileList=file.list();
		
		if(fileList.length>0)
		{
			PriorityQueue<String> sorting=new PriorityQueue<String>();
		
			for(String list:fileList)
			{
				sorting.add(list);
			}
		
			while(!sorting.isEmpty())
			{
				System.out.println(sorting.poll());
			}
		}
		
		else
		{
			System.out.println("Folder is empty");
		}
	}


}

