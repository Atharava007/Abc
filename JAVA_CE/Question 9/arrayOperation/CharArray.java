package arrayOperation;

import java.io.*;

public class CharArray 
{
	char[] array = { 'a', 'B', 'c', 'D', 'e', 'F', 'g', 'h', 'I', 'j','O','u' };
	
	public void convert() 
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == 'a' || array[i] == 'A' || array[i] == 'e' || array[i] == 'E' || array[i] == 'i' || array[i] == 'I' || array[i] == 'o' || array[i] == 'O' || array[i] == 'u' || array[i] == 'U') 
			{
				if (Character.isUpperCase(array[i])) 
				{
					array[i] = Character.toLowerCase(array[i]);
					System.out.println(array[i]);
				} 
				else 
				{
					array[i] = Character.toUpperCase(array[i]);
					System.out.println(array[i]);
				}
			} 
			else
			 {
				System.out.println(array[i]);
			}
		}
	}
}