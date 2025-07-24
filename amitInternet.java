public class amitInternet {
    public static void main(String[] args) {
        String currentPlan = "Standard";
        int useage = 1200;
        if(currentPlan.equals("Basic") && useage > 500){
            System.out.println("suggest : upgrade to premium plan");
        }else if (currentPlan.equals("Standard") && useage > 1000) {
            System.out.println("suggest: upgrade to ultra plan");
        }else{
            System.out.println("continue with same");
    }
}
}