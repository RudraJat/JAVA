import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        printPrime(arr);
        in.close();
    }
    static void printPrime(int[] arr){
        for(int num: arr){
            if(isPrime(num)){
                System.out.print(num+" ");
            }
        }
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
            for(int j=2;j*j<=num;j++){
                if(num%j==0){
                    return false;
                }
        }       
        return true;

    }
}
