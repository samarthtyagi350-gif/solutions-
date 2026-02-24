abstract class shape{
  void draw();
}

class circle extends shape{
  @override
  void draw(){
    print("Drawing circle");
  }
}

class rectangle extends shape{
  @override
  void draw(){
    print("drawing rectangle");
  }
}

void main(){
  shape s1=circle();
  shape s2=rectangle();
  s1.draw();
  s2.draw();
}