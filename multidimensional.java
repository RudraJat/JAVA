import java.util.Scanner;
import java.util.Arrays;
public class multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr=new int[3][3];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }

        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         // System.out.print(arr[row][col]+" ");
        //     }
        //     // System.out.println();
        // }

        //DIFFERENT WATY FOR OUTPUT
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
