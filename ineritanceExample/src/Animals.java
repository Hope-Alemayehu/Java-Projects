public class Animals {
        String name;
        private int age;
    
    Animals(String name,int age){
       
            this.name="Simba";
            
        
    }
        public void roar(){
            System.out.println("The animal made sound.");
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
       

}
