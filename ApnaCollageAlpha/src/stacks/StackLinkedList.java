package stacks;

class Node {


    Node(int data){
        this.data=data;
        next=null;
    }

    int data;
    Node next;
}
class  StackLL{
    Node head=null;

    void push(int data){
   Node newNode =new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    int pop(){
        if(head==null){
            return -1;
        }
        int top= head.data;
        head=head.next;
        return top;
    }
    int peek(){
        int top=head.data;
        return top;
    }
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
}
public class StackLinkedList {
    public static void main(String[] args) {
        StackLL s=new StackLL();
        s.push(20);
        System.out.println(s.isEmpty());
        s.push(204);
        s.push(210);
        s.push(67);
        System.out.println(s.pop());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());

    }
}
