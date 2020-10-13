package practices;

import java.util.HashMap;
import java.util.Iterator;

public class Test 
{
static	void findDuplicate(String str)
{
	HashMap<String,Integer>  hm=new HashMap<String,Integer>();
	String[]s=str.split(" ");
	for(String temp:s)
	{
		if(hm.get(temp)!=null)
		{	
			hm.put(temp,hm.get(temp)+1);
		}
		else
		{
		hm.put(temp,1);
	}
	}
	/*System.out.println(hm);*/
Iterator<String>	terr=hm.keySet().iterator();
while(terr.hasNext())
{
	String ters=terr.next();
	if(hm.get(ters)>1)
			{
		System.out.println("the word"+ters+""+hm.get(ters));
			}
		
			}
	{
}
}

public static void main(String args[])
{
	
	findDuplicate("This is java java program and program Naga Naga");
}
}
	
	