public class A50_MethodReturnValue {
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    int c = sum(a,b);
    System.out.println(c);
  }

  static int sum(int value1, int value2){
    int total = value1 + value2;
    return total;
  }
  
}
