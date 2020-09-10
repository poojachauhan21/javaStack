 
import java.util.ArrayList;

 class DynamicStack extends Stack {
    ArrayList<Integer> myarray;
    
    DynamicStack(){
        this.myarray= new ArrayList();
    }
    
    void push(int element){
        this.myarray.add(++this.top, Integer.valueOf(element));
    }
    
    int pop()
    {
        if(this.top == -1){
            return -1;
        }
    
    return ((Integer)this.myarray.remove(this.top--)).intValue(); 
    }
    
    void display()
    {
        System.out.println("The Stack is : ");
        for(int i=0; i<this.myarray.size(); i++)
        {
            System.out.println(this.myarray.get(i));
        }
        System.out.println();
    }

    
}

