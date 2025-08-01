import java.util.Scanner;

public class marksAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int sum = maths + physics + chemistry;
        int avg = sum / 3;
        System.out.println("the avg is:" + avg);
        System.out.println("the sum of marks is : " + sum);
    }
}
