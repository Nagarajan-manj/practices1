package Test;

public class Reverse {
	public static void main(String args[])
	{
	String str="Nagarajan";
	 	/*char[] characterArray=str.toCharArray();
	 	String rev="";
	 	
	 	 for(int i=characterArray.length-1;i>=0;i--)
	 	 {
	 		 rev=rev+characterArray[i];
	 		 
	 	 }
System.out.println(rev);*/
	
	StringBuffer buf=new StringBuffer();
	buf.append(str);
	System.out.println(buf.reverse());
	
}
}
