import jdk.swing.interop.SwingInterOpUtils;


import java.util.ArrayList;
public class Arrays {
public static int findLargest(int a[]){
  int largest=a[0];

    for(int i=1;i<a.length;i++){

        if (a[i]>largest)
            largest=a[i];
    }
    return largest;
}
    public static  void printArray(int a1[]){
        for(int i=0;i<a1.length;i++)
            System.out.println(a1[i]);
    }
    public static int linerSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                return i;


        }
        return -1;
    }
    public static int binarySearch(int a[],int key){
        int mid ,s=0,e=a.length-1;
        while(s<=e){
            mid=(s+e)/2;
            if(a[mid]==key)
                return mid;
            else if (a[mid]<key)
                s=mid+1;
            else if (a[mid]>key)
                e=mid-1;

        }
    return -1;

    }

    public  static void reverseArray(int a[]){
        for(int i=0;i<a.length/2;i++){{
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;

        }
        }
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        printArray(a);
        System.out.println("index: "+linerSearch(a,10));
        System.out.println("index: "+binarySearch(a,10));
        reverseArray(a);
        printArray(a);
        System.out.println("Largest: "+findLargest(a));


    }

}
