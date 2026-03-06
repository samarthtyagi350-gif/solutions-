void main(){
  String name="samarth";
  int age=20;

  List<int> marks=[90,80,86,98,70];

  Map<String,dynamic> students={
    "name":name,
    "age":age,
    "marks":marks
  };

  print(students);

  print(students.keys.toList());
}