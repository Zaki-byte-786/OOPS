class A{
    String name;
//    A(){
//        System.out.println("i am constructor of A");
//    }
    A(String name){
        this.name = name;
        System.out.println("My name is "+name+" from constructor A");
    }
}
class B extends A{
//    B(){
//        super("Shareef");
//        System.out.println("i am constructor of B");
//    }
//B(String name){
//    super("Shareef");
//    System.out.println("i am constructor of B");
B(String name){
    super("Nadeem");
    this.name = name;

}
}
class C extends B{
//    C(){
//        System.out.println("i am constructor of C");
//    }
    C(String name){
        super("Bablu");
        System.out.println("I am constructor of C");
    }

}
public class constructorChaining {
    public static void main(String[] args) {
C c = new C("Cat");
    }
}
