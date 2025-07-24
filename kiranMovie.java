public class kiranMovie {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isVipSeat = true;
        int ticketPrice;
        if(isWeekend){
            if(isVipSeat){
                ticketPrice = 500;
            }else{
                ticketPrice = 300;
            }
        }else{
            if(isVipSeat){
                ticketPrice = 400;
            }else{
                ticketPrice =200;
            }
        }
        System.out.println(isWeekend);
        System.out.println(isVipSeat);
        System.out.println(ticketPrice);
    }
}
