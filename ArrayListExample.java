// import java.lang.reflect.Array;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        ArrayList <Integer> List=new ArrayList <> ();

        while(true){
            int num=in.nextInt();
            if(num<0){
                break;
            }
            List.add(num);
        }

        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
    }
}
