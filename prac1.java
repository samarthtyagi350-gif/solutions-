class employee{
private int empNo;
private String empName;
private int empBasic;

 public employee( int n,String name,int basic){
    empNo=n;
    empName=name;
    empBasic=basic; 
}

public void getemployee(int empNo){
    System.out.println(empNo);
}

public void getemployee(int empName){
    System.out.println(empName);
}

public void getemployee(int empbasic){
    System.out.println(empbasic);
}


}


public class prac1 {
    public static void main(String[] args) {
        employee s =new employee(73782993,"samarth",100);
        
    }
    
}
