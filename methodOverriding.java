class A{
    int age;
    void foo(){
        System.out.println("I am constructor of class A");
    }
    void foo(int x){
        System.out.println("I am constructor of class A");
    }

}

class B extends A{
    @Override
    void foo(){
        System.out.println("I am constructor of class A");
    } // this method is indeed a overridden method but unnecessary since it has been already
    // defined by its super class
//    @Override
    @Override
    void foo(int y){
        System.out.println("I am constructor of class B");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.foo();

    }
}
