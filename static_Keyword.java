class staticDemo{
    int roll;
    String name;
    static String CName = "IITK";
    staticDemo(int roll,String name){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println("My name is "+name+" and roll no is "+roll+" and studying in "+CName);
    }
}
class staticVariableInitialization{
    static int x = 5;
    static int y ;
    static {
        System.out.println("I am static block");
        y = 5 * x;
    }

}
public class static_Keyword {
    public static void main(String[] args) {
staticDemo rahul = new staticDemo(12,"Rahul Singh");
staticDemo sahil = new staticDemo(16,"Sahil Khan");
rahul.display();
sahil.display();
        System.out.println(rahul.CName);
        staticVariableInitialization obj = new staticVariableInitialization();
        System.out.println(staticVariableInitialization.y);

    }
}
