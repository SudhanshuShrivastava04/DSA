public class CustomStack {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    private boolean isFull(){
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr == - 1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty now");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty so cannot peek");
        }

        return data[ptr];
    }





}
