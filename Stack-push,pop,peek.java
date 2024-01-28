
//final keyword:not changable value
//private->particular block only access it
import java.util.Scanner;
public class Main {
      private int[] stackArray;
      private int top = -1;
      private int maxSize;

      public Main(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
    }

    // push
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full, cannot push");
        }
    }
    //pop
    public int pop() {
        if (top >= 0) {
            int popArray = stackArray[top--];
            System.out.println("Popped: " + popArray);
            return popArray;
        } else {
            System.out.println("Stack is empty, cannot pop");
            return -1; // or throw an exception
        }
    }
    //peek
    public int peek() {
        if (top >= 0) {
            int peekValue = stackArray[top];
            System.out.println("Peek: " + peekValue);
            return peekValue;
        } else {
            System.out.println("Stack is empty, cannot peek");
            return -1; // or throw an exception
        }
    }

    public static void main(String args[]) {
        int maxSize;
        Scanner sc=new Scanner(System.in);
        maxSize=sc.nextInt();
        Main stack = new Main(maxSize);
        int numberOfElements = sc.nextInt();

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            int element = sc.nextInt();
            stack.push(element);
        }

        stack.pop();
        stack.peek();
    }
}

