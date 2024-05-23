public class Student extends User {
    double psp;
    String batch;
Student(){
    System.out.println("i am constructor of child class");
}
    public static void main(String[] args) {
        Student s = new Student();
//        s.name = "Aatif";
          /* the above line will throw an error because we are trying to
        access the private name of user( Parent Class) from a Student(sub class)
         */
//        s.setName("Aatif");
//        System.out.println(s.getName());
    }
}

