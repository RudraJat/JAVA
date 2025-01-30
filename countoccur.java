import java.util.Scanner;
public class countoccur {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long a=in.nextLong();

        int count=0;
        for(int i=0;i<1004;i++){
            long rem=a%10;
            if(rem==n){
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
