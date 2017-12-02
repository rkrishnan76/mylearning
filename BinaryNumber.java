import java.io.*;
import java.util.*;

public class BinaryNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int numOfConsecutiveOnes=0;
        boolean reset=true;
        int temp=0;
        while(true){
            if(i%2==1 && ++temp>numOfConsecutiveOnes) numOfConsecutiveOnes=temp;
            if(i%2==0) temp =0;
            i = i/2;
            if(i==0) break;
        }
        System.out.println(numOfConsecutiveOnes);
    }
}
