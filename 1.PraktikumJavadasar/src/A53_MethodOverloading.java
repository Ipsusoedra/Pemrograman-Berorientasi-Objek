public class A53_MethodOverloading {
  public static void main(String[] args) {

    sayHello();
    sayHello("Eko");
    sayHello("Eko", "Kurniawan");
  }

  static void sayHello(){
    System.out.println("Hello");
  }

  static void sayHello(String firstname){
    System.out.println("Hello " + firstname);
  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
