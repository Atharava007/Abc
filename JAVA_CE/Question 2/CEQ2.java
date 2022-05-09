import java.io.*;

public class CEQ2
{
	public static void main(String args[]) throws IOException
	{
		String line;
		char lineArr[];
		String ToggleString = "";
		char ToggleArray[];
		char wordArr[];
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./input.txt")));
			FileOutputStream output = new FileOutputStream(args[0]);
			while((line = br.readLine())!=null)
			{
				lineArr = line.toCharArray();
				for(char ch:lineArr)
				{
					if(Character.isUpperCase(ch))
						ToggleString += Character.toLowerCase(ch);
					else if(Character.isLowerCase(ch))
						ToggleString += Character.toUpperCase(ch);
					else if(Character.isDigit(ch))
						ToggleString += '#';
					else
						ToggleString += ch;
				}
				ToggleArray = ToggleString.toCharArray();
				for(char ch1:ToggleArray)
				{
					output.write(ch1);
				}
				output.write('\n');
				ToggleString = "";
			}
			System.out.println("Operation Successful!!");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found");
		}
	}
}

