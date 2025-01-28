import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no. is: "+rollno);
        input.close();
    }
}
