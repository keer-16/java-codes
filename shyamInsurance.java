public class shyamInsurance {
    public static void main(String[] args) {
        int age = 65;
        int premium;
        if(age>60){
            premium = 5000;
        }else if(age >= 40 && age <60){
            premium = 3000;
        }else if(age >=20 && age<40){
            premium = 1500;
        }else if(age <20){
            premium = 1000;
        }else{
            System.out.println("invalid age");
            return;
        }
        System.out.println(age);
        System.out.println(premium);
    }
}