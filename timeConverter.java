import java.util.*;
public class timeConverter { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total seconds");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds =remaining % 60;
        System.out.println("hours:" + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);
    }
}
