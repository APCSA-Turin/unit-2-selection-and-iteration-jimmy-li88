package U3T6;

public class Student {
    private String firstName;
    private static final int DefaultPoints = 0;  
    private int points = 0;  
    private static int totalPoints; 
    private static int maxPoints; 
    public Student(String firstName){
        this.firstName = firstName;
        this.points = DefaultPoints; 
    }
    public String studentInfo(){
        return "Student: " + firstName + "\n" + "Student's Points: " + points; 
    }
    public void addPoints(int addPoints){
        points = points + addPoints;
        if (points > maxPoints){
            maxPoints = points;
        }
        totalPoints = totalPoints + points;  

    }
    public int getTotalPointsEarned(){
        return totalPoints; 
    }
    public int getGreatestPoints(){
        return maxPoints; 
    }
    public static String classInfo(){
        return "Total points earned by all students: " + totalPoints + "\n" + "Most points earned by any student: " + maxPoints;
    }

}
