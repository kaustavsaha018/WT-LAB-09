package Marketing;

import java.util.Scanner;

import General.Employee;

public class Sales extends Employee{
    public void tallowance(double basic){
        System.out.println("Tavel Allowance is: "+ String.format("%.2f", basic*0.05));
    }
    public static void main(String[] args) {
        Sales S1 = new Sales();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Id of the Sales Person: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the Name of the Sales Person: ");
        String name = sc.nextLine();
        S1.getEmployeeDetails(id,name);
        System.out.print("Enter the Basic Salary of the Sales Person: ");
        double basic_sal = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println("Sales Person ID: "+S1.empid);
        S1.earnings(basic_sal); 
        S1.tallowance(basic_sal);  
    }    
}
