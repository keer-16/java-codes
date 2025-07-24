public class foodDelivery {
    public static void main(String[] args) {
        int choice = 2; 

        boolean storeOpen = true;
        int distance = 8;
        boolean deliveryAvailable = true;
        boolean tableAvailable = false;

        switch (choice) {
            case 1: 
                if (storeOpen) {
                    System.out.println("Pickup is allowed.");
                } else {
                    System.out.println("Pickup not available.");
                }
                break;

            case 2:
                if (distance <= 10 && deliveryAvailable) {
                    System.out.println("Delivery is available.");
                } else {
                    System.out.println("Not Deliverable.");
                }
                break;

            case 3:
                if (tableAvailable) {
                    System.out.println("Table booked successfully.");
                } else {
                    System.out.println("No tables available.");
                }
                break;

            default:
                System.out.println("Invalid choice selected.");
        }
    }
}
