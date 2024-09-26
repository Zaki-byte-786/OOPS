class A1 {
    int age;
    void foo(){
        System.out.println("I am constructor of class A1");
    }
    void foo(int x){
        System.out.println("I am constructor of class A1");
    }

}

class B2 extends A1 {
    @Override
    void foo(){
        System.out.println("I am constructor of class A1");
    } // this method is indeed a overridden method but unnecessary since it has been already
    // defined by its super class
//    @Override
    @Override
    void foo(int y){
        System.out.println("I am constructor of class B2");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        B2 b = new B2();
        b.foo();

    }
}
