 abstract class Animal{
    abstract void sound();
}

class dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}


public class Abstract {
    public static void main(String[] args){
        Animal a=new dog();
        Animal b=new cat();

        a.sound();
        b.sound();

    }
    
}
