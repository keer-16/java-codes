public class priyaShopping {
    public static void main(String[] args) {
        int price = 5000;
        Boolean isMember = true;
        double discount;
        if(isMember) {
            if(price >= 10000) {
                discount = 0.30 * price;
            } else if(price >= 5000) {
                discount = 0.20 * price;
            } else {
                discount = 0.0; 
            }
        } else {
            discount = 0.05 * price;
        }
        double finalAmount = price - discount;
        System.out.println(price);
        System.out.println(isMember);
        System.out.println(discount);
        System.out.println(finalAmount);
    } 
}
