import java.util.*;
public class breakAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        
        int thousands = amount/1000;
        amount = amount % 1000;

        int fivehundreds = amount/500;
        amount = amount % 500;

        int remaining = amount;
        System.out.println("thousands: " + thousands);
        System.out.println("five hundreds: " + fivehundreds);
        System.out.println("remaining: " + remaining);
    }
}
