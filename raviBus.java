public class raviBus {
    public static void main(String[] args) {
    int distance = 170;
    int fare;
    boolean isWeekend = true;
    if(distance < 50){
        fare = 50;
    }else if(distance >=50 && distance <= 100){
        fare = 100;
    }else{
        if(isWeekend){
            fare = 300;
        }else{
            fare = 200;
        }
    }
    System.out.println(distance);
    System.out.println(isWeekend);
    System.out.println(fare);
  }
}