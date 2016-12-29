
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        
        Skier skier1 = new Skier("Matti");
        Skier skier2 = new Skier("Timo");
        
        skier1.jump();
        skier1.addScore(skier1.jump());
        skier2.jump();
        skier2.addScore(skier1.jump());
        
        
        
        if (skier1.compareTo(skier2) <= 0) {
            System.out.println(skier1.toString());
            System.out.println(skier2.toString());
        } else {
            System.out.println(skier2.toString());
            System.out.println(skier1.toString());
        }
    }
}
