/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A57_Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayHello("Eko");
        sayHello("");
    }
    static void sayHello(String name){
    String hello = "Hello " + name;
    if(!name.isBlank()){
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
//    System.out.println(hi);
  }
    
}
