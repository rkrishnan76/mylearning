package client;
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

public class HourGlassProblem {
    public HourGlassProblem() {
        super();
    }
    
 

        public static void main(String[] args) {
            //Scanner in = new Scanner(System.in);
            int arr[][] = new int[6][6];
            int maxSum=0;
            int h=0;
            for(int i=0; i < 6; i++){
                for(int j=0; j < 6; j++){
                    arr[i][j] = h++;
                }
            }
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                              int tempSum = arr[i][j]   + arr[i][j+1]   + arr[i][j+2]
                                                        + arr[i+1][j+1] +
                                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                            if(maxSum<tempSum)
                                maxSum=tempSum;

                        }
                    }
            System.out.println(maxSum);
        }
    }

