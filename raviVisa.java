public class raviVisa {
    public static void main(String[] args) {
        int age = 18;
        boolean hasPassport = truee;
        boolean noCriminalRecord = true;
        if (age>=18 && hasPassport &&noCriminalRecord){
            System.out.println("eligible for visa");
        }else if(age >=18 && !hasPassport && noCriminalRecord){
            System.out.println("apply for passport first");
        }else if( age < 18 || !noCriminalRecord){
            System.out.println("not eligible");
        }else{
            System.out.println("invalid");
        }
    }
}
