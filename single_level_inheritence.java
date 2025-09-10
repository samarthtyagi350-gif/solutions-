class p{
    String colour;
}

class c extends p{
    public void prnt(){
        System.out.println(colour);
    }
}

public class single_level_inheritence {
    public static void main(String[] args) {
        c c1=new c();
        c1.colour="red";
        c1.prnt();


    }
    
}
