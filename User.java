public class User {
private String name;
String email;
String password;
void updateEmail(String email){
    this.email = email;
}
void updatePassword(String password){
    this.password = password;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    User(){
        System.out.println("I am default constructor of parent class");
    }
//    public static void main(String[] args) {
//        User user = new User();
//    }
}
