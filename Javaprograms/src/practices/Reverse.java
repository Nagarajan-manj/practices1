package practices;

public class Reverse 
{
	public static void main(String args[])
	{
	
	String str="murali";
	
	 int temp= str.length();
	 
	 String rev="";
	 
	 for(int i=temp-1;i>=0;i--)
	 {
		rev=rev+str.charAt(i);
	 }
System.out.println(rev);
	}

}
