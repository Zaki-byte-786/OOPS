
public class introduction {
    public static void main(String[] args) {
class Student {
    String name ;
    int roll_no;
    float cgpa;
    int Class = 12;
    void greeting(String name){
        System.out.println("My name is "+this.name);
    }
    Student(){
        this.name = "Ashraf";
        this.roll_no = 05;
        this.cgpa = .67f;
        this.Class = 11;
    }
    Student(String name,int roll_no,float cgpa,int Class){
         this.name = name;
         this.roll_no = roll_no;
         this.cgpa = cgpa;
         this.Class = Class;
    }
    Student(Student other){
        this.name = other.name;
        cgpa = other.cgpa;
//        this.Class = 13;
    }
}
Student student1 = new Student();

//        Student student2 = new Student();
        Student student2 = new Student("Ahmad",17,7.48f,10);
        Student student3 = new Student(student2);
        Student student4 = new Student("Aazam",27,7.46f,11);
        Student student5 = new Student();

//        Student student2 = new Student("Ahmad");
//        student1.name = "Ashraf";
//        student1.roll_no = 05;
//        student1.cgpa = .67f;
//        System.out.println(student1.name);
//        System.out.println(student2.name);
        student1.greeting("ahsaan");
        student2.greeting("ahsaan");
        student3.greeting("ahsaan");
        System.out.println(student2.name);
        System.out.println(student2.roll_no);
        System.out.println(student3.cgpa);
        System.out.println(student1.Class);
        System.out.println(student2.Class);
        System.out.println(student3.Class);
        System.out.println(student3.name);
        System.out.println(student3.Class);
        System.out.println(student3.cgpa);

    }
}
