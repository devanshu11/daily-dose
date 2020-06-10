package solution2;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class JumpingOnClouds {
	static int steps =  0;
	static int position = 0;
	
    static int jumpingOnClouds(int[] c) {

    	if (position==c.length-1) return steps;
    	else if (c[position+2]!=1 ) {
    		position+=2;
    		steps+=1;
    		JumpingOnClouds.jumpingOnClouds(c);
    		return steps;
		}    	
    	else if (c[position+1]!=1 ) {
    		position+=1;
    		steps+=1;
    		JumpingOnClouds.jumpingOnClouds(c);
    		return steps;
		}
    	else return steps;
		
    	
    	
    


    }
    public static void main(String[] args) {
    	
    	int[] c = {0,0,1,0,0,1,0};
    	int result = jumpingOnClouds(c);
    	System.out.println(result);
	}

}
