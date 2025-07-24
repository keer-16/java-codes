public class carService {
    public static void main(String[] args) {
         int kilometer = 25000;
         String serviceType;
         if(kilometer > 20000){
            serviceType = "full service";
         }else if(kilometer >=10000 && kilometer <=20000){
            serviceType = "semi service";
         }else if(kilometer >=0 && kilometer<1000){
            serviceType = "general checkup";
         }else{
            serviceType = "invalid kilometer value";
         }
         System.out.println(kilometer);
         System.out.println(serviceType);
    }

    
}
