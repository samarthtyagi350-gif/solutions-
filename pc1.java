class Student{
    String name;
    int age;
    public void info(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
     
    }

}


public class pc1 {
   public static void main(String[] args) {
    Student s=new Student("Samarth",20);
    
    s.info(); 
   } 
}
