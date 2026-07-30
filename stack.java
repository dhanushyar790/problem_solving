// "static void main" must be defined in a public class.
public class stack {
    int top;
    int size;
    int arr[];
    public stack(int val){
        arr=new int[val];
        size=val;
        top=-1;}
    public void push(int data){
        if(top>size-1){
            System.out.println("Stack overflow");
        }
        arr[++top]=data;
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
        }
        return arr[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
    public boolean full(){
        return size-1==top;
    }
    public boolean empty(){
        return top==-1;
    }
    public void printstack(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack s1=new stack(5);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s1.size;i++){
           int data=sc.nextInt();
            s1.push(data);
        }
        s1.printstack();
        System.out.println("popped elements:"+s1.pop());
        s1.printstack();
    }
}
