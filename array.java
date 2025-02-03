import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr= new int [5];

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (i == arr.length - 1) {
        //         System.out.print(arr[i]);
        //     } else {
        //         System.out.print(arr[i] + ", ");
        //     }
        // }

        System.out.println(Arrays.toString(arr));
    }
}
