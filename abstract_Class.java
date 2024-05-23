abstract class parentAbstractClass {
    void display(){
        System.out.println("I am a method of class abstract");
    }
   abstract void abstractMethod(int x);
}
class childAbstractClass extends parentAbstractClass{
    void greet(){
        System.out.println("Good Morning");
    }
    void abstractMethod(int x){
        System.out.println("O my luck");
    }
}
public class abstract_Class {
    public static void main(String[] args) {

    }
}
