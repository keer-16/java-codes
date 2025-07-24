public class shoppingDiscount {
    public static void main(String[] args) {
        int price = 3500;
        Boolean isMember = true;
        Boolean hascoupon = true;
        int discount = 0;
        if(price == 5000 && isMember){
            discount = 25;
            System.out.println("you get 25% discount");
        }else if(price >3000 && isMember && hascoupon){
            discount = 20;
            System.out.println("you get 20% discount");
        }else if(price >3000 && (isMember || hascoupon)){
            discount = 10;
            System.out.println("you get 10% discount");
        }else{
            System.out.println("no discount available");
        }
        int discountedPrice = price - (price *discount)/100;
        int finalprice = price - discountedPrice;

        System.out.println("total price is:" + price);
        System.out.println("discount applied:" +discount);
        System.out.println("discounted price:" +discountedPrice);
        System.out.println("to pay:" + finalprice);
    } 
}
