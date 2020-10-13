import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Scanner1  implements Serializable  
{  
public static void main(Strtest args[]) throws IOException, ClassNotFoundException   
{  
ArrayList<String>  name=new ArrayList<String>();
name.add("Test1");
name.add("Test3");
name.add("Test2");


FileOutputStream  str=new FileOutputStream("I:\\kann.txt");
ObjectOutputStream st1=new ObjectOutputStream(str);
st1.writeObject(name);
str.close();
st1.close();
st1.flush();

FileInputStream ab=new FileInputStream("I:\\kann.txt");
ObjectInputStream cd=new ObjectInputStream(ab);
ArrayList  list=(ArrayList)cd.readObject();  
System.out.println(list); 

}
}




