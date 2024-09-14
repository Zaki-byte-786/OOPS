class A{
  A(){
      System.out.println("I am a constructor of class A");
  }
  A(int x,int y){
      System.out.println("I am constructor of A with 2 parameter");
  }
}
class B extends A{
   B(){
       System.out.println("I am constructor of class B");
   }
   B(int x){
           System.out.println("I am constructor of B with parameter");
   }
   B(int x,int y){
       super(2,3);
       System.out.println("I am constructor of B with 2 parameter");
   }
}
class C extends B{
    C(){
        System.out.println("I am constructor of class C");
    }
    C(int x,int y){
        super(2,3);
        System.out.println("I am constructor of C with 2 parameter");
    }
}
public class constructor_Chaining {
    public static void main(String[] args) {
//        A a = new A();
//        B a = new B();
        C c = new C(1,2);
//        C c = new C();
    }

}
