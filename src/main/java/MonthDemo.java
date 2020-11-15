
import java.util.Scanner;

public class MonthDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter name of first month: ");
        String monthInput1 = keyboard.nextLine();
        Month month1 = new Month(monthInput1);
        
        System.out.println("enter name of first month: ");
        String monthInput2 = keyboard.nextLine();
        Month month2 = new Month(monthInput2);
        
        System.out.println("month 1 number: " + month1.getMonthNumber());
        System.out.println("month 2 number: " + month2.getMonthNumber());
        
        System.out.println(month1);
        System.out.println(month2);
        
        System.out.println("equals: " + month1.equals(month2));
        
        System.out.println("greater than: " + month1.greaterThan(month2));
        System.out.println("less than: " + month1.lessThan(month2));
    }
}
