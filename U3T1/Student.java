package U3T1;

public class Student {

  private String name;

  private int gradeLevel;

  private String school;

    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    public Student(String name, int grade){
        this.name = name;
        this.gradeLevel = grade;
        this.school = "Unknown";
    }


    public String studentInfo() {
        if (gradeLevel < 1 || gradeLevel > 12) {
            school = "unknown";
        } 
        else if (gradeLevel >= 1 && gradeLevel <= 5) {
            school = "elementary school";
        }
        else if (gradeLevel >= 6 && gradeLevel <= 8) {
            school = "middle school";
        }
        else {
            school = "high school";
        }
        return name + " is in grade " + gradeLevel + " and goes to " + school;

  }

}


