
// import package
import DataStructure.MyStack;

public class App {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(6);
        stack.push(20);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(104);
        stack.push(106);
        stack.push(107);
        stack.push(109);
        stack.print();
    }
}