void main(){
  fetchdata();
}

void fetchdata(){
  print("data is loading...");
 Future.delayed(Duration(seconds: 5)).then((abc){
  print("data is displayeed after 5 seconds");
 });
  print("data loaded successfully");
}