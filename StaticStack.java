class StaticStack extends Stack {

    int[] myarray;
    int size;

    StaticStack(int element) {
        this.size = element;
        this.myarray = new int[this.size];
    }

    void push(int element) {
        if (this.top == this.size - 1) {
            System.out.println("Stack Overflow");
        } else {
            this.myarray[(++this.top)] = element;
        }
    }

    int pop() {
        if (this.top == -1) {
            return -1;
        }

        return this.myarray[(this.top--)];
    }

    void display() {
        System.out.println("The stack is : ");
        for (int i = 0; i <= this.top; i++) {
            System.out.println(this.myarray[i] + " ");
        }
        System.out.println();
    }

}
