import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long rev = 0;
        
        while(n!=0){
            long rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);   
        in.close();
    }
}
