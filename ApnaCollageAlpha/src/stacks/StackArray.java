import java.util.Scanner;

public class StackArray {
    public  int [] s=new int[5];
    public  int top=0;
    public void push(int data){
        if(this.top==this.s.length){
            System.out.println("StackOverFlow...");
            return;
        }
        top++;
        s[top]=data;
    }
    public int pop(){
       if(top==-1){
           System.out.println("StackUnderFlow....");
           return Integer.MIN_VALUE;
       }
        int data = this.s[top];
        top--;
        return data;
    }
    public int peek(){
        if(top==-1){
            System.out.println("StackUnderFlow");
            return Integer.MIN_VALUE;
        }
        return s[top];
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else 
            return false;
        
    }
    public boolean isFull(){
        if(top==s.length-1)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        StackArray s=new StackArray();
        int d;
        boolean b;
        Scanner sc =new Scanner(System.in);
        char ch;
        do{
            System.out.println("1.PUSH\n 2.pop\n3.peek\n4.isEmpty\n5.isFull");
            
            System.out.println("ENTER TOUR CHOISE: ");
            int c= sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter the Data");
                     d=sc.nextInt();
                    s.push(d);
                    break;
                case 2:
                     d=s.pop();
                    System.out.println("Deleted Element : "+d);
                    break;
                case 3:
                    d=s.peek();
                    System.out.println("Top Element : "+d);
                    break;
                case 4:
                     b=s.isEmpty();
                    System.out.println(b);
                    break;
                case 5:
                     b=s.isFull();
                    System.out.println(b);
                    break;
                default:
                    System.out.println("InvalidChoice");
                    
                    
            }
            System.out.println("Do you want to Continue: ");
            ch=sc.next().charAt(0);
            
        }while(ch=='y'||ch=='Y');
    }
}
