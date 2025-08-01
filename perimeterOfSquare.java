import java.util.*;
public class perimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side :");
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("the perimeter of square is : " + perimeter);
    }
}