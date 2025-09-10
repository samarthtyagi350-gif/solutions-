class Rectangle{
    int length,breadth;
    void area(){
        System.out.println("area is" + this.length * this.breadth); 
    }
    void perimeter(){
        System.out.println("perimeter is" + 2*(this.length + this.breadth)); 
    }

}

public class q3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.length=20;
        r1.breadth=10;
        r1.area();

        r2.length=30;
        r2.breadth=40;
        r2.perimeter();
    }
    
}
