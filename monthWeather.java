public class monthWeather {
    public static void main(String[] args) {
        String season;
        String month = "march";
        if(month.equals("Jan") || month.equals("feb") || month.equals("march")){
            season ="winter";
        }else if(month.equals("april") || month.equals("may") || month.equals("june")){
            season = "summer";
        }else if(month.equals("july") || month.equals("aug") || month.equals("sep")){
            season = "rainy";
        }else if(month.equals("oct") || month.equals("nov") || month.equals("dec")){
            season =  "monsoon";
        }else{
            season = "invalid month";
        }
        System.out.println(month);
        System.out.println(season);
    }
}