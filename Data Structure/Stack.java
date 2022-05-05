public class Stack {
    private int stack[];
    private int size;
    private int top;

    public Stack (int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
        
    }
    // Creating push() method
    public void push(int element) {
        if (top == size - 1){
            System.out.println("Stack is full");
        } else {
            System.out.println("Adding element into the stack - " + element);
            stack[++top] = element;
        }
        
    }
    // Creating pop() method
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("Removing top element - " + stack[top]);
            return stack[top--];
        }
        
    }
    // Creating peek() method
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("Top element - " + stack[top]);
            return stack[top];
        }
        
    }
    // Creating isEmpty() method
    public Boolean isEmpty(){
        return (top < 0);
    }
}
