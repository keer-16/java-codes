public class passport {
    public static void main(String[] args) {
        double percentage = 87.3;
        int experience = 4;
        boolean hasBonfied = true;
        int backlogs = 0;
        boolean passed = true;
        if(percentage >90 && experience >5 && hasBonfied){
            System.out.println("eligible for apply for passport");
        }else if(percentage >=70 && percentage <90 && experience < 5 && backlogs == 0){
            System.out.println("certificate issued");
        }else if(passed) {
            System.out.println("certificate issued");
        }else{
            System.out.println("not eligible");
        }
    }
}
