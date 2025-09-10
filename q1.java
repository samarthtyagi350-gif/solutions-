class Student{
    String name;
    int age;
    void display(){
        System.out.println(this.name);
        System.out.println(this.age);   
    }
}

public class q1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="samarth";
        s1.age=20;
        s1.display();
        
    }
    
}

