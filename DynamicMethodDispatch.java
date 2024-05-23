class phone{
    void call(){
        System.out.println("Calling by phone");
    }
    void snakeGame(){
        System.out.println("playing snake game by Phone");
    }

}
class smartPhone extends phone{
    @Override
    void call(){
        System.out.println("Calling by Smartphone");
    }
    void videoCall(){
        System.out.println("Video Call by Smartphone");
    }
    void whatsApp(){
        System.out.println("I am chatting");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
   phone sph = new smartPhone(); // allowed since a smartPhone is indeed a phone
   //smartPhone ph = new phone(); // not allowed since every phone
        // not necessarily be a Smartphone
        sph.call();
        sph.snakeGame();
    //    sph.videoCall(); // not allowed

    }
}
