import java.util.*;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length :");
        double length = sc.nextDouble();
        System.out.println("enter the breadth");
        double breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("the perimeter is : " + perimeter);
    }
}