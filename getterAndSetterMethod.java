class getterAndSetterDemo{
   private String name;
   private int age ;
   void setName(String name){
       this.name = name;
   }
   String getName(){
       return name;
   }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }

    getterAndSetterDemo(String name , int age){
        this.name = name;
        this.age = age;
    }
}
public class getterAndSetterMethod {
    public static void main(String[] args) {
        getterAndSetterDemo gs = new getterAndSetterDemo("Haaris",23);
//        System.out.println(gs.name);
        /* this will throw an error because we are trying to access
         a private variable in another class */
        gs.setName("Aahad");
        System.out.println(gs.getName());


    }
}
