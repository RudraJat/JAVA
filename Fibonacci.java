import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        
        for(int i=0;i<n;i++){
            int temp =b;
            b+=a;
            a=temp;
        }
        System.out.println(a);
        in.close();
}
}