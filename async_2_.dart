void main(){
  fetchdata();
}

void fetchdata()async{
  print("data is loading...");
getdata().then((data){
  print(data);

});
  String data=await getdata();
 Future.delayed(Duration(seconds: 5)).then((abc){
  print("data is displayeed after 5 seconds");
 });
  print("data loaded successfully");
}


Future<String> getdata()async{
  Future.delayed(Duration(seconds: 5));
  return "data is loading";
}

