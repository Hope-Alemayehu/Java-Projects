interface DogInterface{
    //we don't have to put abstract here because in interface all 
    //all methoods are abstract
    //public void bark();
    /* this is an error because abstract methoods don't specify a body
    {
        System.out.println("Bark");
    }*/
    
    //void poop();
    void ate();
}

 abstract class Dog{
    public void bark(){
    System.out.println("Bark");
}
//doesn't know what to do now    
public abstract void poop(); 
}
class Chiwawa extends Dog{
    public void poop(){
        System.out.println("The dog fucking pooped");
    }
}
//to use the dog interface instead
class Sheperd implements DogInterface{
   public void ate(){
    System.out.println("The dog didn't eat today");
   }
}

public class App {
    public static void main(String[] args) throws Exception {
        //it says you can't instantiate the type dog because the 
        //the class is abstract.
        Chiwawa c= new Chiwawa();
        c.bark();
        c.poop();
        Sheperd s= new Sheperd();
        s.ate();
}
}
