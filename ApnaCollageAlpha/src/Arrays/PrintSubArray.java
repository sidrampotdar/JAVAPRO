public class PrintSubArray {

 public static int subArray(int a[]) {
     int sum = 0, stemp=0, s;
     for (int i = 0; i < a.length; i++) {
         System.out.println();
         System.out.print(a[i] + " ");
         s = a[i];
         System.out.print("Sum: " +s);
         System.out.println();
         for (int j = i + 1; j < a.length; j++) {
                    stemp=0;
             for (int k = i; k <= j; k++) {
                 System.out.print(a[k] + " ");
                 stemp += a[k];
             }
             System.out.print("Sum: " + stemp);
             System.out.println();
             if (s < stemp)
                 s = stemp;
         }
            if(i==0)
                sum=s;
            else if (s>sum){
                sum=s;
            }

     }
return sum;
 }
 public static void main(String[] args) {
        int a[]={0000,-0777,-6748870,-8876870,-76470,-76760};

        int temp=subArray(a);
     System.out.println("Highest Sum: "+temp);

    }
}
