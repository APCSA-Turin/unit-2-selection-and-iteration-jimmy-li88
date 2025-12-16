package U3T1;

public class Person {
    private String firstName; 
    private String lastName;
    private int meetCounter = 0;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String meet(String PersonOther) {
        meetCounter++;
        return "Hello, my name is " + firstName + "\n" + "Hi, my name is " + PersonOther;
    }
    public int getMeetings(){
        return meetCounter;
    }
}
