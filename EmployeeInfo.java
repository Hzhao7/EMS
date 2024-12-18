

public class EmployeeInfo {

    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender; // encode e.g. 0 for M, 1 for F, etc.
    public int workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public String getGender() {
        if (gender == 0){
            return "Male";
        }
        if (gender == 1){
            return "Female";
        }
        if (gender == 2){
            return "Other";
        }
        return null;
    }
    
    public String getWorkLoc() {
    	if (workLoc == 0){
            return "Mississauga";
        }
        if (workLoc == 1){
            return "Toronto";
        }
        if (workLoc == 2){
            return "Silicon Valley";
        }
        if (workLoc == 3){
            return "Texas";
        }
        if (workLoc == 4){
            return "Other";
        }
        return null;
    }
    
    public double getDeduct() {
    	return deductRate;
    }
    
    public double calcNetAnnualIncome() {
        return (-1.0);
    }
    
}
