public class vikramVisa {
    public static void main(String[] args) {
        int age = 21;
        boolean hasPassport = true;
        if(age >=18 && hasPassport){
            System.out.println("visa application accepted");

        }else if(age >=18 && !hasPassport){
            System.out.println("visa application rejected");
        }else{
            System.out.println("visa not allowed for applicant under 18");
        }
    }
}
