import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int sum = maths + physics + chemistry;
        System.out.println("the sum of marks is : " + sum);
    }
}
