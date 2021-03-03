package General;

public class Employee{
    protected int empid;
    private String ename;
    public void getEmployeeDetails(int empid, String ename){
        this.empid=empid;
        this.ename=ename;
    }  
    public void earnings(double basic){
        System.out.println("Total Earnings: "+ String.format("%.2f", basic+(basic*0.95)));
    } 
}