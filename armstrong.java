import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        printArmstrong(arr);
        in.close();
    }
    static void printArmstrong(int[] arr){
        for(int num:arr){
            if(isArmstrong(num)){
                System.out.println(num);
            }
        }
    }
    
    static boolean isArmstrong(int num){
        int temp = num, sum=0, dig=0;
        int n=num;

        //count digits
        while(n>0){
            dig++;
            n/=10;
        }
        n=num;

        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,dig);
            n/=10;
        }
        return sum==temp;
        
    }
}
