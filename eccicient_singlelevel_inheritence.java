class Person{
     private String name;
     private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
        } 

    public void display(){
        System.out.println(name+age);
    }
        
        
    }
    

class Student extends Person{
        private int roll_no;

    Student(String name,int age ,int roll_no){
        super(name,age);
        this.roll_no=roll_no;
    
    }

    public void display(){
        super.display();
        System.out.println(this.roll_no);
    }

    }

    public class eccicient_singlelevel_inheritence{
        public static void main(String[] args) {
            Student s=new Student("sam",20,73);
            s.display();;
        }
    }