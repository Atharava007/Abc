class SmallNumber extends Exception{

public String toString(){
	return("Smaller Number entered");
}
}
class ProperNumber extends Exception{

public  String toString(){
return("proper Number entered");
}
}

class LargeNumber extends Exception{

public String  toString(){
	return("Large Number entered");
}
}
class ExceptionDemo1 extends Exception
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

				if(num>=0 && num<=5)
				{
					int n = factorial(num);
					System.out.format("%d! = %d\n",num,n);
					throw new SmallNumber();
				}
				else if(num>5 && num<=10)
					{
						throw new ProperNumber();
					}
				else if(num>10)
						{
							throw new LargeNumber();	
						}
		}
					catch(SmallNumber sn)
					{
						System.out.println(sn);
					}
				
					catch(ProperNumber pn)
					{
						System.out.println(pn);
					}
			
			catch(LargeNumber ln)
			{
				System.out.println(ln);
			}
		
	}
}	
			 
			
		
