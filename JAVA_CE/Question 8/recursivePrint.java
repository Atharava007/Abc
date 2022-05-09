//8
import java.io.*;

class arrayInput
{
	protected int[] numbArray;
	protected int idx;
	
	public arrayInput()
	{
		
	}
	
	public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Number of Elements: ");
		this.idx = Integer.parseInt(br.readLine());
		
		this.numbArray = new int[idx]; 
		for(int i=0;i<this.idx;i++)
		{
			System.out.print("Enter the number ["+(i+1)+"] : ");
			this.numbArray[i] = Integer.parseInt(br.readLine());
		}
	}
}


class printArray extends arrayInput
{
	printArray()
	{
		super();
	}
	static void printArr(int[] numbArray,int temp_idx)
	{
		if(temp_idx != -1)
		{
			printArr(numbArray,temp_idx-1);
			System.out.println(numbArray[temp_idx]);
		}
		
	}
	public static void main(String[] args) throws IOException
	{
		printArray rp = new printArray();
		rp.accept();
		printArray.printArr(rp.numbArray,rp.idx-1);
	}
}
