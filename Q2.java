interface motor{
    int capacity=25; //it is a public static final variable
    void run();
    void consume();
}
class washingMachine implements motor{
    @Override
    public void run(){
        System.out.println("Washing Machine is Running");
    }
    @Override
    public void consume(){
        System.out.println("Washing Machine is Consuming Power");
    }
    void displayCapacity(){
        System.out.println("It has got a capacity of "+capacity+" litres");
    }
}
public class Q2 {
    public static void main(String[] args) {
        washingMachine W1 = new washingMachine();
        W1.run();
        W1.consume();
        W1.displayCapacity();
    }
}
