public class eamcetExam {
    public static void main(String[] args) {
        Boolean applyExam = true;
        Boolean writeExam = true;
        Boolean qualified = true;
        Boolean docVerify = true;
        int rank = 4200;
        String seatCode;
        if(applyExam){
            System.out.println("application submitted");
            if(writeExam){
                System.out.println("exam written");
                if(qualified){
                    System.out.println("qualified");
                    if(docVerify){
                        System.out.println("docs verified");
                        if(rank >=1 && rank <=5000){
                            seatCode="CSE AI";
                        }else if(rank >5000 && rank <=10000){
                            seatCode="CSE";
                        }else if(rank > 10000 && rank <=20000){
                            seatCode="ECE";
                        }else{
                            seatCode ="not allocated";
                        }
                        System.out.println(seatCode);
                    }else{
                        System.out.println("doc verfiy failed");
                    }
                }else{
                    System.out.println("not qualified");
                }
            }else{
                System.out.println("not written");
            }
        }else{
            System.out.println("not applied");
        }
    }
}
