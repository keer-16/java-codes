import java.util.*;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base :");
        double base = sc.nextDouble();
        System.out.println("enter the height :");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("the area of triange :" + area);
 }
}