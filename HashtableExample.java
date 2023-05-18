 import java.util.*;
 
 public class HashtabelExample {
   public static void main(String[] args) {
        //hashtable with the size of 10
        Hashtable<String,String> table = new Hashtable<>(10, 0.5f);

        table.put("100","Spongebob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","Atlas");
        table.put("777","lors");

        
        for(String key:table.keySet()){
        //hashcode is made by hash function and can be used to generate indexes
        
        System.out.println(key.hashCode()%10 +"\t"+key + "\t" +table.get(key));
        
        }
    }
}
