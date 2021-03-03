import java.util.Scanner;

interface Salary{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements Salary{
    double basic_salary;
    Manager(double basic_salary){
        this.basic_salary=basic_salary;
    }
    @Override
    public void earnings(){
        System.out.println("Earnings: Rs. "+ String.format("%.2f", basic_salary+(basic_salary*0.95)));
    }
    @Override
    public void deductions(){
        System.out.println("Deductions: Rs. "+ String.format("%.2f", (basic_salary*0.12)));
    }
    abstract public void bonus();
}
class Substaff extends Manager {
    Substaff(double basic_salary){
        super(basic_salary);
    }
    @Override
    public void bonus(){
        System.out.println("Bonus: Rs. "+ String.format("%.2f", (basic_salary*0.5)));
    }
    
}
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary of the substaff: ");
        double basic = sc.nextDouble();
        sc.close();
        Substaff S1 = new Substaff(basic);
        S1.earnings();
        S1.deductions();
        S1.bonus();
    }
}
