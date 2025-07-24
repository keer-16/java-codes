public class marksList {
    public static void main(String[] args) {
        int percentage = 95;
        String grade;
        String status;
        if(percentage >=85 && percentage <=100){
            grade = "A";
            status = "very high standard";
        }else if(percentage >=70 && percentage <85){
            grade = "B";
            status = "high standard";
        }else if(percentage >=50 && percentage < 70){
            grade = "C";
            status ="sound standard";
        }else if(percentage >=25 && percentage <50){
            grade = "D";
            status ="limited standard";
        }else if(percentage >=0 && percentage <25){
            grade = "E";
            status = "very limited standard";
        }else{
            grade ="invalid";
            status = "invalid percentage";
        }
        System.out.println(percentage);
        System.out.println(grade);
        System.out.println(status);
    }
}
