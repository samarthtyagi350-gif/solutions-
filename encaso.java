class Animal{
    void eat(){
        System.out.println("animal");
    }
}

// data hiding and data abstraction.

class dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }

}



public class encaso {
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
    }
    
}
