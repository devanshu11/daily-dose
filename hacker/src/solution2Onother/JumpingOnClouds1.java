package solution2Onother;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class JumpingOnClouds1 {
	static int steps =  0;
	static int position = 0;
	private static final Scanner scanner = new Scanner(System.in);
	
    static int jumpingOnClouds(int[] c) {
    	if (position==c.length-1) return steps;
    	else if (c[position+2]!=1 ) {
    		position+=2;
    		steps+=1;
    		JumpingOnClouds1.jumpingOnClouds(c);
    		return steps;
		}    	
    	else if (c[position+1]!=1 ) {
    		position+=1;
    		steps+=1;
    		JumpingOnClouds1.jumpingOnClouds(c);
    		return steps;
		}
    	else return steps;
    }
    public static void main(String[] args) throws IOException{
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
