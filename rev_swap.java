import java.util.Arrays;
import java.util.Scanner;
public class rev_swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        reverse(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }

        static void reverse(int[] arr){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        static void swap(int[] arr, int first, int last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
    }
}
