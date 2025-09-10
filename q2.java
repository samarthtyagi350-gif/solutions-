class car{
    int speed;
    String brand;
    void drive(){
        System.out.println(this.speed);
        System.out.println(this.brand);
    }
}

public class q2 {
    public static void main(String[] args) {
        car c1=new car();
        c1.speed=300;
        c1.brand="Bugatti";
        c1.drive();
    }
    
}