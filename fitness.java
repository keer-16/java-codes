public class fitness {
    public static void main(String[] args) {
        int age = 45;
        double bmi = 28.5;
        boolean hasHeartCondition = false;
        if(age <40 && bmi <=25 && !hasHeartCondition){
            System.out.println("high intensity  program");
        }else if(age < 60 && (bmi <=30 || hasHeartCondition)){
            System.out.println("moderate program");
        }else{
            System.out.println("consult doctor first");
        }
    }
}