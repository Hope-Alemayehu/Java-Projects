import java.util.Hashtable;

public class HashtabelExample{
    public static void main(String[] args) {
        
        Hashtabel<Integer,String> table = new Hashtable<>(10,0.5f);

        table.put(100,"Spongebob");
        table.put(123,"Paatrick");
        table.put(321,"Sandy");
        table.put(555,"Atlas");
        table.put(777,"lors");

        System.out.println(table.get(100));

    }



}