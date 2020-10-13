package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class Prac 
{
	int id;
	int values;
	
	Prac(int id,int values)
	{
		this.id=id;
		this.values=values;
	}
	
public static void main(String [] args)
{
	
	List<Prac> arr=new ArrayList<Prac>();
	arr.add(new Prac(1,10));
	arr.add(new Prac(2,20));
	arr.add(new Prac(3,20));
	arr.add(new Prac(4,30));
	
	Map<Integer,Integer>   se=arr.stream()
			.collect(Collectors.toMap(p->p.id,p->p.values));	
	      System.out.println("the numbers is: " +se);
			        
	
			
	
}
}
