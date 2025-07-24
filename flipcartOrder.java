public class  {
    public static void main(String[] args) {
        int price = 3000;
        Boolean isMember = true;
        Boolean hascoupon = true;
        int discount = 0;
        if(price == 5000 && isMember && hascoupon){
            discount = 20;
        }else if(price >=3000 &&isMember && hascoupon){
            discount = 15;
        }else if(price <3000 && isMember && hascoupon){
            discount = 10;
        }
        int discountedPrice = price - (price *discount)/100;
        int finalprice = price - discountedPrice;

        System.out.println("total price is:" + price);
        System.out.println("discount applied:" +discount);
        System.out.println("discounted price:" +discountedPrice);
        System.out.println("to pay:" + finalprice);
    } 
}
