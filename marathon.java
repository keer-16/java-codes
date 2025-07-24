public class marathon {
    public static void main(String[] args) {
        int age = 21;
        boolean medicalCerfiticate = true;
        if(age >=18 && age<=45){
            if(medicalCerfiticate){
                System.out.println("can participate in marathon");
            }else{
                System.out.println("participation denied no valid medical certificate");
            }
        }else{
            System.out.println("participation not allowed");
        }
    }
}
