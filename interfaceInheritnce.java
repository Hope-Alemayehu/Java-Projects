interface Vehicle{
    void start();
    void stop();

}
interface Car {
    void accelrate();
    void brake();

}
abstract class model {
    abstract void year();
}
class Sedan extends model implements car,Vehicle{
    public void year(){
             System.out.println("2003");
    }
    public void start(){
             System.out.println("Sedan starting...");
    }
    public void stop(){
            System.out.println("Sedan stopping...");
    }
    public void accelrate(){
            System.out.println("Sedan accelerating...");
    }
    public void brake(){
            System.out.println("Sedan braking...");
    }
}