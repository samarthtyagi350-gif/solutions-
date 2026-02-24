class Student{
  String? name;
  int? age;
  int? marks;
  String? city;
  Student(this.name,this.age,this.marks,this.city);
    display(){
      print("$name $age $marks $city");
    }
  }



void main(){
  Student s1=Student("Ramesh",20,20,"modinagar");
  Student s2=Student("sam",30,20,"meerut");
  Student s3=Student("sahil",60,20,"niwari");
 
  List<Student> students=[s1,s2,s3];

  for(var p in students){
     p.display();
  }

}

// 
