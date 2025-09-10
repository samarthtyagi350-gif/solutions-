class Book{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
  void display(){
    System.out.println(title);
    System.out.println(author);
  }
 
    }


public class q4 {
    public static void main(String[] args) {
        Book b=new Book("GOT","Mike"); 
        b.display();


    }
    
}

// use contructors when there are maximum 3 t0 4 value to pass throug instead of doing a.name="saarth" ora.age=20. constructor makes code easy and safer.
