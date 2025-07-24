public class scholarship {
    public static void main(String[] args) {
        int percentage = 87;
        boolean sportCertificate = true;
        boolean volunteerExp  = false;
        int familyIncome = 200000;
        if(percentage>=90 && sportCertificate && familyIncome<=200000){
            System.out.println("eligible for full scholarship");
        }else if(percentage>=86 && (sportCertificate || volunteerExp )){
            System.out.println("eligible for partial scholarship");
        }else{
            System.out.println("not eligible");
        }
    }
}
