class Parent{
    String name;
    int age;
}

class Child extends Parent{
    public void info(){
        System.out.println(name+age);
    }

class Child2 extends Child{
    public void info1(){
        System.out.println(name+age);
    }
}


}


public class multilevel_inheritence {
    public static void main(String[] args) {
        Child p=new Child();
        p.name="sam";
        p.age=20;
        p.info();




    }
    
}
