package hacker;



public class Solution1 {

	public static void main(String[] args) {
		System.out.println("hello");
        String s = "DDDUDDD";
        int i =s.length();
        int result = Solution1.countingValleys(i, s);
        System.out.println(result);
    }

	public static int countingValleys(int n, String s) {
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
    	return valleys;
	}
}
