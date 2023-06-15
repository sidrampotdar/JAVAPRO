import java.util.ArrayList;

class Stack{
    public ArrayList<Integer> s = new ArrayList<>();
    public void push(int data){
        this.s.add(data);

    }
    public int pop(){
        if(this.s.size()==0){
            return -1;
        }
        int top=s.get(s.size()-1);
        s.remove(s.size()-1);
        return top;
    }
    public int peek(){
        return s.get(s.size()-1);
    }
    public boolean isEmpty(){
        if(this.s.size()==0){
            return true;
        }
        else
            return false;
    }
 }
public class StackArrayList {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(10);
        s.push(120);
        s.push(167);
        s.push(10000);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
        System.out.println(s.isEmpty());
    }
}
