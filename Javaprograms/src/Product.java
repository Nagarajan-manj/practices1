import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    int age;
    public Product(int id, String name, float price,int age) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
        this.age= age;
    }  
 
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f,34));  
        productsList.add(new Product(2,"Dell Laptop",30000f,28));  
        productsList.add(new Product(3,"Dell Laptop",28000f,28));  
        productsList.add(new Product(4,"Sony Laptop",28000f,28));  
        productsList.add(new Product(5,"Apple Laptop",90000f,20));  
        
        productsList.stream().filter(p->p.age>20)
        .map(p->p.age).forEach(System.out::println);
     
         
    }  
}  