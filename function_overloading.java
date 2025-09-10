class Std{
    String name;
    int age,number;

    public void print(String name){
        System.out.print(name);
    }
    public void print(int age){
        System.out.print(age+" ");
    }
    public void print(long number){
        System.out.print(number);
    }
}


public class function_overloading {
    public static void main(String[] args) {
        Std s1=new Std();
        s1.name="sam";
        s1.age=20;
        s1.number=3434434;

        s1.print(s1.age);
        s1.print(s1.number);
    }
}
