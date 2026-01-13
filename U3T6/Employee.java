package U3T6;

public class Employee {
    private String firstName; 
    private String lastName; 
    private static final int idNumber = 100; 
    private static int employeeNum = 0; 
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        employeeNum++;

    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public int getID(int employee){
        return idNumber + employee; 
    }
    public static int getMostRecentEmployeeID(){
        return idNumber + employeeNum; 
    }
    public static int getTotalEmployeesCreated(){
        return employeeNum; 
    }
    public String employeeInfo(){
        return "Employee full name: " + firstName + " " + lastName + "\n" + "Employee ID: " + (idNumber + employeeNum)  + "\n" +"Most recent ID assigned: "+ (idNumber + employeeNum) +  "\n" + "Total employees hired: " + employeeNum;






    }
}
