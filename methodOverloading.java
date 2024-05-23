class methodOverloadingDemo{
    void foo(){
        System.out.println("I am method with no argument");
    }
    void foo(int age){
        System.out.println("i am a method with "+age+" years old");
    }
    void foo(String address){

    }
    void foo(int age,String name){}
    void foo(String name,int age){}
    void foo(String name,int roll,int ase){}
    void foo(String name,int age,float gpa){}
    void foo(String name,float gpa,int age){}
    void foo(int age,String name,float gpa){}
    void foo(int age,float gpa,String name){}

}
public class methodOverloading {
    public static void main(String[] args) {

    }
}
