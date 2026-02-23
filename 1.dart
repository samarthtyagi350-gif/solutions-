// void main(){
//     var a="hello";
//     var b=10;
//     var c=10.10;
//     print(a.runtimeType);
// }

// can not reassign a val. we can change it using 
// void main(){
//     var a="hello";
//     a=10;
//     var c=10.10;
//     print(a.runtimeType);
// }

// void main(){
//     var a;
//     a=10;
//     a="hello";
//     var b=10;
//     var c=10.10;
//     print(a);
// }

//null safety(nullabe type operator)
// if we use ? then null values are allowed
// void main(){
//     String? name;
//     print(name.toString());
//     print(name.hashCode);
    
// }

// late variable
// late String name;
// void main(){
//     final name="abc";
//     print(name);
//     name="sam";
//     print(name);
// }

// late String name;
// void main(){
//    final time=DateTime.now();
//    print(time);
// }

// late String name;
// void main(){
//     // const list=[1,2,3,4]; // if we use const we can not make changes in list.
//    final list=[1,2,3,4];
//    list.add(6);
//    print(list);
// }

// void main(){
    // var hex=0xABCD;
    // print(hex);
    // print(hex.runtimeType);
    // var v=1.1;
    // var v2=1.32e5;
    // print(v2);
    // print(v2.runtimeType);

    // var one=int.parse("1");
    // assert(one==1);  //assert only shows a message when the condition is false. runs on terminal
    // //string ->double
    // var onepointone=double.parse("1.1");
    // assert(onepointone==1.1);

    // String a=1.toString();
    // assert(a=="1");

//     String fname="Goku";
//     String lname="Tyagi";

//     print("$fname $lname");   
// }


import 'dart:io';
void main(){
    print("Enter first number");
    double num1=double.parse(stdin.readLineSync()!);

    print("Enter second number");
    double num2=double.parse(stdin.readLineSync()!);
    
    double sum=num1+num2;
    print(sum);
}





