package U3T5;

public class Temperature {
    private double highTemp;
    private double lowTemp; 
    private String scale; 
    public Temperature(double highTemp, double lowTemp, String scale){
        this.highTemp = highTemp; 
        this.lowTemp = lowTemp; 
        this.scale = scale; 
        if(!this.scale.equals("F") || !this.scale.equals("C")){
            this.scale = "F";
        }
    }

    public static double convertCtoF(double C){
        return (C * 9/5)  + 32; 
    }

    public static double convertFtoC(double F){
        return (F - 32) * 5/9;
    }

    public void changeToC(){
        if (this.scale.equals("F")){
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
        } else {
            this.highTemp = this.highTemp;
            this.lowTemp = this.lowTemp; 
        }
    }
    public void changeToF(){
        if (scale.equals("C")){
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
        } else { 
            highTemp = highTemp;
            lowTemp = lowTemp; 
        }
    }
    public String tempInfo(){
        return "High temperature: " + highTemp + " " +  scale + "\n" + "Low temperature: " + lowTemp + " " +  scale; 
    }
}
