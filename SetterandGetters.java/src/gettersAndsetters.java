public class gettersAndsetters{
    String name;
    int age;

    public static void main(String[] args) throws Exception {
        gettersAndsetters a=new gettersAndsetters();
        a.setName("Hope");
        a.setAge(45);
        System.out.println(a.getAge1());
        System.out.println(a.getName());
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;

    }
    public int getAge1(){
        return this.age;
        
    }
    
    
    
    }

}
