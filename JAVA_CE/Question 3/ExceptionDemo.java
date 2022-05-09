class ExceptionDemo extends Exception
{
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}	
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		try
		{
			if(num<0)
			{
				throw new ExceptionDemo();
			}
			try
			{
				if(num>=0 && num<=5)
				{
					int n = factorial(num);
					System.out.format("%d! = %d\n",num,n);
					throw new ExceptionDemo();
				}	
				try
				{
					if(num>5 && num<=10)
					{
						throw new ExceptionDemo();
					}
					try
					{
						if(num>10)
						{
							throw new ExceptionDemo();	
						}
					}
					catch(ExceptionDemo ed)
					{
						System.out.println("Greater Number");
					}
				}
				catch(ExceptionDemo ed)
				{
					System.out.println("Proper Number");
				}
			}
			catch(ExceptionDemo ed)
			{
				System.out.println("Smaller Number");
			}
		}
		catch(ExceptionDemo ed)
		{
			System.out.println("Number is negative, Please enter positive number");
		}
	}
}	
			 
			
		
