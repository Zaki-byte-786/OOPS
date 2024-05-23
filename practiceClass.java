class  Student{
    String name ;
    int roll_no ;
    float cgpa;
    int Standard = 12;
    Student(String name,int roll_no,float cgpa){
         this.name = name;
         this.roll_no = roll_no;
         this.cgpa = cgpa;
        System.out.println("I am constructor with unknown name,roll_no and cgpa");
    }
    Student(Student Aqdas){
        this.name = "Syed Shuja Abbas";
        this.roll_no = 21;
        this.cgpa = Aqdas.cgpa;  // this ko Shuja replace krdega and Aqdas to apni jaga rhega
    }
    Student(){
//        System.out.println("i am empty constructor");
        /*
         -> this is how you call a constructor from inside a constructor.
         -> internally :  new Student("Aatif",15,8.6f)
            this is happening
         */

        this("Aatif",15,8.6f);
    }
        }
public class practiceClass {
    static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
//        Student Aqdas = new Student("Mohammad Aqdas",9,7.4f);
//        Student Yasir = new Student("Mohammad Yaasir",17,7.78f);
//        Student Salman = new Student("Mohammad Salman",12,8.45f);
//        Student Shuja = new Student(Aqdas);
        Student unknown = new Student(); //
//        System.out.println(Aqdas.cgpa);
//        System.out.println(Salman.cgpa);
//        System.out.println(Shuja.cgpa);
//        System.out.println(unknown.name);
//        System.out.println(unknown.roll_no);

//         Student one = new Student();   /* one and two both are pointing to same object hence any change
//                                           in one will be reflected in two as well
//                                        */
//         Student two = one;
//         two.name = "Something something";
//        System.out.println(one.name);
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b); /* a and b will not be swapped because
        when we pass a and b in swap method there values are passed not the
        original a and b
        */

        /* final keyword
        this conserve the value of a variable i.e we cant change that value
         */
//        final int x = 10;
//        x = 20;           // this line giving error
      /* any final variable inside a class must be initialized otherwise it will
      throw an error
       */
    }
}
