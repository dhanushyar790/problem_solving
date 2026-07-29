
import java.util.*;
public class Linkedlist {
    Node head;
        class Node{
            int data;
            Node next;
            
            Node(int val){
                data=val;
                next=null;
            }
        }
    Linkedlist(){
            head=null;
        }
        public void insert( int val){
            Node newnode = new Node(val);
            if(head==null){
                head=newnode;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            }
        }
    public void insertbegin(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertpos(int val,int pos){
        Node newnode=new Node(val);
        if(pos==1){
            insertbegin(val);
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void reverse(){
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
        temp=temp.next;}
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            l1.insert(val);
        }
        l1.display();
        l1.insertbegin(60);
        l1.display();
        l1.insertpos(70,3);
        l1.display();
        l1.reverse();
        l1.display();
    
        
    }
}
