
import java.util.Scanner;
import java.util.Scanner;

public class demoStack {

    public static void main(String[] paramArrayOfString) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter");
        System.out.println("1.Static Stack");
        System.out.println("2.Dynamic Stack");
        System.out.println("3.Exit");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("Enter array size");
                int size = sc.nextInt();
                StaticStack myStaticStack = new StaticStack(size);
                System.out.println("Enter");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Display");
                String opt;
                do {
                    System.out.println("Enter your choice");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter a number to be pushed into the stack");
                            int j = sc.nextInt();
                            myStaticStack.push(j);
                            break;
                        case 2:
                            int k = myStaticStack.pop();
                            if (k == -1) {
                                System.out.println("Underflow");
                            } else {
                                System.out.println("Number popped = " + k);
                            }
                            break;
                        case 3:
                            myStaticStack.display();
                            break;
                        default:
                            System.out.println("Wrong Choice");

                    }
                    System.out.println("Enter 'y' if you want to continue");
                    opt = sc.next();
                } while (opt.equals("y") || opt.equals("Y"));
                break;
            case 2:
                DynamicStack myDynamicStack = new DynamicStack();
                System.out.println("Enter");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Display");
                do{
                    System.out.println("Enter your choice");
                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println("Enter a number to be pushed into the stack");
                            int i1 = sc.nextInt();
                            myDynamicStack.push(i1);
                            break;
                        case 2:
                            int i2 = myDynamicStack.pop();
                            if (i2 == -1) {
                                System.out.println("Underflow");
                            } else {
                                System.out.println("Number popped = " + i2);
                            }
                            break;
                        case 3:
                            myDynamicStack.display();
                    }
                    System.out.println("Enter 'y' if you want to continue");
                    opt = sc.next();   
                }while(opt.equals("y") || opt.equals("Y") );
        }
    }

}
