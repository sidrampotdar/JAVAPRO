class Room{
    int height,length,breadth;

    Room(int l ,int h,int b){
        this.height=h;
        this.length=l;
        this.breadth=b;
    }
    void disp(){
        System.out.println("Height: "+height);
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);

    }
}
class BedRoom extends Room {
    String col;
    int volume;
    BedRoom(int l,int h,int b,String col){
        super(l,h,b);
        this.col=col;

    }
    void calculate(){
        this.volume=length*breadth*height;
    }
    void display(){
        super.disp();
        System.out.println("color: "+col);
        System.out.println("Volume: "+volume);
    }

    }



public class SingleInh {
    public static void main(String[] args) {
        BedRoom bd=new BedRoom(10,20,30,"RED");
        bd.calculate();
        bd.display();


    }
}
