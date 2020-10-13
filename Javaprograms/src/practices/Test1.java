package practices;

public class Test1 
{
	/*int div=0;
	int a=10,b=2;*/
	
	public int test()
	{
	try
	{
/*		div=a/b;
		return div;*/
		return 777;
	}
	catch(ArithmeticException e)
	{
	  return 888;
	}
	/*finally
	{
		
		return 333;
	}*/
	}

	public static void main(String [] args)
	{
		Test1 te=new Test1();
		System.out.println(te.test());
	}
	
	}

	