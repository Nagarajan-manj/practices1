package practices;

public class Occurence 
{
	public static void main(String args[])
	{
	
	String input="nagarajan";
	char str='a';
	int occurence=0;
	
	for(int i=0;i<input.length();i++)
	{
		if(input.charAt(i)==str)
		{
			occurence=occurence+1;
		}		
}
	System.out.println("occurence is: \n" + occurence);
}	
}