import java.util.*;  
import java.io.*;  
public class Properties1 {  
public static void main(Strtest[] args)throws Exception{  
    FileReader reader=new FileReader("D://workspace//Javaprograms//src//Config//Configure.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("browser"));    
   
}  
}  