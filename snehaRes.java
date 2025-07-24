public class snehaRes {
    public static void main(String[] args) {
        int sub1 = 92;
        int sub2 = 86;
        int sub3 = 88;
        int sub4 = 79;
        int sub5 = 98;
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total/5.0;

        if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35){
            if(average >= 90){
                System.out.println("outstanding");
            }else if(average >=75){
                System.out.println("distinction");
            }else if(average >=60){
                System.out.println("first class");
            }else{
                System.out.println("sneha passed");
            }
        }else{
            System.out.println("sneha failed");
        }
    }
}
