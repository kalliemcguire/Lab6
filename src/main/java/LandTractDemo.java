
import java.util.Scanner;

public class LandTractDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the length of the first tract:");
        double firstTractLength = keyboard.nextDouble();
        
        System.out.println("Please enter the width of the first tract:");
        double firstTractWidth = keyboard.nextDouble();
        
        LandTract landTract1 = new LandTract(firstTractLength, firstTractWidth);
        
        System.out.println("Please enter the length of the second tract:");
        double secondTractLength = keyboard.nextDouble();
        
        System.out.println("Please enter the width of the second tract:");
        double secondTractWidth = keyboard.nextDouble();
        
        LandTract landTract2 = new LandTract(secondTractLength, secondTractWidth);
        
        System.out.println(landTract1);
        System.out.println(landTract2);
        
        System.out.println("LandTract1 Area: " + landTract1.getArea(firstTractLength, firstTractWidth));
        
        System.out.println("LandTract2 Area: " + landTract2.getArea(secondTractLength, secondTractWidth));
        
        System.out.println("Are the tracts equal?: " + landTract1.equals(landTract2));
    }
}
