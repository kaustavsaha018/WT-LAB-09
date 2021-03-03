abstract class Student{
    int roll_no;
    long reg_no;
    String course_name;
    Student(int roll_no,long reg_no){
        this.roll_no=roll_no;
        this.reg_no=reg_no;
    }
    abstract public void course(String course_name);
}
class Kiitian extends Student{
    Kiitian(int roll_no,long reg_no){
        super(roll_no,reg_no);
    }
    @Override
    public void course(String course_name){
        this.course_name=course_name;
    }
    public void getStudentDetails(){
        System.out.println("Roll No: "+roll_no);
        System.out.println("Regestration No: "+reg_no);
        System.out.println("Course Enrolled in: "+course_name);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Kiitian k1 = new Kiitian(1929018, 19228468368l);
        k1.course("Computer Science and Communication Engg.");
        k1.getStudentDetails();
    }
}