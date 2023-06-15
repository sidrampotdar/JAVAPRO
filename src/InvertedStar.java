public class InvertedStar {
    public static void main(String[] args) {
        for(int j=4;j>=1;j--){
            for(int i=j;i>=1;i--)
                System.out.print("*");
            System.out.println();
        }
    }
}
