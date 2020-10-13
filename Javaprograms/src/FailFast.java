import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class FailFast 
{

	    private static Object List;

		public static void main(String[] args) throws IOException, ClassNotFoundException {  
//	    	CopyOnWriteArrayList<String> pro = new CopyOnWriteArrayList<String>();  
	    	
	        ArrayList<String> pro = new  ArrayList<String>();
	    	
	        //Adding Products  
	        
	        pro.add("Test1");
	        pro.add("Test4");
	        pro.add("Test3");
	        pro.add("Test2");
	        
	        pro.remove(0);
	        
	        Collections.sort(pro);
	        
	        for(String ite:pro)
	        	
	        System.out.println(ite);
	        
		}
}
	        
	        
	        
	        
	