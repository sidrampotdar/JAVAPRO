import java.util.HashMap;
public class PrefixSum

{
    public  static int[] prefixSum(int [] a){
        int p[]=new int[a.length];
        p[0]=a[0];
        for(int i=1;i<p.length;i++){
            p[i]=p[i-1]+a[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int a[]={56,2423,565,56,8676};
        int prefixsum[]=prefixSum(a);
    }

}
