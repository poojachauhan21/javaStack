abstract class Stack{
    int top;
    
    Stack()
    {
        this.top = -1;
    }
    
    abstract void push(int element);
    abstract int pop();
    abstract void display();
}