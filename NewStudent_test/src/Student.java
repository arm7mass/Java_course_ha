
// the class
public class Student {
// attributes 
    public int StudentNumber;
    public String StudentName;
    public String StudentCode;
    public String BranchName;
    private double grade;
    
// constructor   
    public Student() {
        System.out.println("\n new student is created :\n ");
        StudentNumber = 0;
        StudentName = "empty name";
        StudentCode = "empty code";
        BranchName = "empty branch";
    }
    
// method 1
    public String[] getAllData() {
        String strAll[] = {String.valueOf(StudentNumber), StudentName, StudentCode, BranchName};
        return strAll;
    }
    
// method 2
    public String getAllDataInString() {
        String strAll = String.valueOf(StudentNumber) + ";" + StudentName + ";" + StudentCode + ";" + BranchName;
        return strAll;
    }

}
