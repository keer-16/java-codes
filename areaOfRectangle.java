import java.util.*;
public class areaOfRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        double length = sc.nextDouble();
        System.out.println("enter the breadth");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("the area of rectangle is " + area);
    }
}
