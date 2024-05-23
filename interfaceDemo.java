import java.security.PublicKey;

interface Bicycle{
    int speedOfbycycle = 30;
    void handleBrake(int decrement);
    void paddle(int increment);
}
interface car{
    int speedOfCar = 150;
    void footBrake(int decrement);
    void accelerate(int increment);
}
class human implements Bicycle,car{
    @Override
    public void handleBrake(int decrement) {
        System.out.println("Apply brake to reduce your speed from "+speedOfbycycle+" to "+(speedOfbycycle-decrement));
    }
    public void paddle(int increment){
        System.out.println("paddle the cycle to accelerate your speed from "+speedOfbycycle+" to "+(speedOfbycycle+increment));
    }

    @Override
    public void footBrake(int decrement) {
        System.out.println("push the footBrake to reduce your speed from "+speedOfCar+" to "+(speedOfCar-decrement));
    }

    @Override
    public void accelerate(int increment) {
        System.out.println("Push the accelerator to speed up from "+speedOfCar+" to "+(speedOfCar+increment));
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
    human h = new human();
    h.accelerate(20);
    h.footBrake(10);

        //h.speedOfCar = 450;
        // h.speedOfbycycle = 100;
        // will throw an error since the properties of interface are final

        
    }
}
