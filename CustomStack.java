
public class CustomStack {
   int[] data;
    private static final int len=10;

    int ptr=-1;

    public CustomStack(){
        this(len);
    }

    public CustomStack(int size){
        this.data=new int [size];
    }

    public boolean push(int item){
        if (isfull()) {
            System.out.println("stacck is full!!");
            return false;
        }

        ptr++;
        item=data[ptr];
        return true;
    }

     public int pop() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty!!");
        }
        return data[ptr--];
     }

     public int peek() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty!!");
        }
        return data [ptr];
     }

    public boolean isfull(){

        return ptr==data.length-1;
    }
    public boolean isempty(){
        return ptr==-1;
    }
}