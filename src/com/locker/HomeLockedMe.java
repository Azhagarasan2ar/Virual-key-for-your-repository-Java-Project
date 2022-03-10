package com.locker;


public class HomeLockedMe {
	static {
		System.out.println("Welcome to Lockers Pvt. Ltd\nApplication name:LockedMe\nDeveloper name: Azhagarasan A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		
		while(true)
		{
			System.out.println("\n1)Files List 2)Buisness Operation 3)Exit");
			
			int option=context.getInput();

			if(option==1)
			{
				context=new Context(new SortFile());
				context.execute();
			}
				
			else if(option==3)
			{
				System.out.println("Quitting...");
				break;
			}
				
			else if(option==2)
			{
				do
				{
					System.out.println("\n1)Add 2)Delete 3)Search 4)Home");
					
					option=context.getInput();
					
					if(option==1)
					{
						context=new Context(new AddFile());
						context.execute();
					}
						
					else if(option==2)
					{
						context=new Context(new DeleteFile());
						context.execute();
					}
						
					else if(option==3)
					{
						context=new Context(new SearchFile());
						context.execute();
					}
					else if(option==4)
					{
						System.out.println("");
					}
					else
					{
						System.out.println("Invalid Input");
					}
					}while(option!=4);
					
			}
			
			else
			{
				System.out.println("Invalid Input");
			}
				
				
		}
		
		context.userInput.close();
		System.out.println("Quitted Sucessfully");
	}


}
