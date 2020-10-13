import java.util.function.Predicate;
class Kannan 
{
	
	public static void main(Strtest args)
	{
       Predicate<Integer> p=i->i%2==0;
       System.out.println(p.test(4));
	}

}
