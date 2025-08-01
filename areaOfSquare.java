import java.util.*;
public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square :");
        double side = sc.nextDouble();
        double area = side * side ;
        System.out.println("the area of square is: " + area);
    }
}