import java.util.*;  
import java.io.*;  
public class Strtest {  
public static void main(String[] args)throws Exception{  
    FileInputStream reader=new FileInputStream("D://db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  