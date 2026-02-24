abstract class animal{
  void sound();

  void sleep(){
    print("Animal is sleeping");
  }
}

class dog extends animal{
  @override
  void sound(){
    print("dog barks");
  }
}

void main(){
  dog d=dog();
  d.sound();
  d.sleep();
}