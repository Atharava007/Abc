import java.io.*;

class conversion implements NumberConversion{

	int num;
	
	public void convertToBinary(int num)
	{
		
		int binary[] = new int[40];
		int index=0;
		while(num>0){
			binary[index++] = num%2;
			num = num/2;
		}
		System.out.print("Decimal to Binary Result is : ");
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(binary[i]);;
		}
 	
	}
	
		public void convertToOctal(int num)
	{
		
		int octal[] = new int[100];
		int index=0;
		while(num!=0){
			octal[index++] = num%8;
			num = num/8;
		}
		System.out.print("Decimal to Octal Result is : ");
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(octal[i]);;
		}
 	
	}
	
		public void convertToHex(int num)
	{
		
		int hex[] = new int[100];
		int index=0;
		while(num>0){
			hex[index++] = num%16;
			num = num/16;
		}
		System.out.print("Decimal to Hexadecimal Result is : ");
		
		for(int i=index-1;i>=0;i--)
		{
			if(hex[i]>9)
				System.out.print((char) (55+hex[i]));	
			else
				System.out.print(hex[i]);;
		}
 	
	}
	
	
	public static void main(String args[]) throws IOException
	{
		int num;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter decimal number : ");
		num = Integer.parseInt(br.readLine());	
		
		conversion c = new conversion();
		c.convertToBinary(num);
		System.out.println("");	
		c.convertToOctal(num);	
		System.out.println("");	
		c.convertToHex(num);
	}
}