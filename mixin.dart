mixin ElectricVarient{
  void electricvarient(){

  }
}

mixin PetrolVarient{
  void petrolvarient(){
    print("This is petrol varient");
  }
}

class tesla with ElectricVarient{}

class hybridcar with ElectricVarient, PetrolVarient{}

void main(){
  tesla t=tesla();
  t.electricvarient();
  print("---------");

  hybridcar hc=hybridcar();
  hc.electricvarient();
  hc.petrolvarient();
}