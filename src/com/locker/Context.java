package com.locker;


public class Context extends UserInterface  {
	
	private Locker lock;
	
		public Context()
		{
		
		}
	
		public Context(Locker lock)
		{
			this.lock=lock;
		}
	
		public void execute()
		{
			lock.doOperation();
		}
	

	

}

