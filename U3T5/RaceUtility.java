package U3T5;

public class RaceUtility {
    public RaceUtility() { }

    public static double milesToKm(double miles){
        return miles * 1.609; 
    }
    public static double kmToMiles (double km){
        return km / 1.609;
    }
    public static String makeProper(String word){
        String temp = word.substring(0,1);
        for (int i = 2; i < word.length(); i++){
            String temp2 = word.substring(i, i+ 1).toLowerCase();
            temp += temp2; 
        }
        return temp; 
    }
}
