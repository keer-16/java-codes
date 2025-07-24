public class productReturn {
    public static void main(String[] args) {
        int category = 1; 
        int daysSincePurchase = 5;
        boolean isTagAttached = true;

        switch (category) {
            case 1: 
                if (daysSincePurchase <= 7) {
                    System.out.println("Return allowed for Electronics.");
                } else {
                    System.out.println("Return not allowed for Electronics");
                }
                break;

            case 2: 
                if (isTagAttached) {
                    System.out.println("Return allowed for Clothing.");
                } else {
                    System.out.println("Return denied for Clothing.");
                }
                break;

            case 3:
                System.out.println("Return denied for Books");
                break;

            default:
                System.out.println("Invalid category.");
        }
    }
}