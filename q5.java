class Circle{
    int r;

    Circle(int rad){
        r=rad;
    }

    void area(){
        float a=(float)(3.14)*r*r;
        System.out.println("Area is " +a);
    }
}


public class q5{
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.area();
    }
}