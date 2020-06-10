package solution4;

public class AlternatingCharacter {
    static int alternatingCharacters(String s) {
    	s=s.toUpperCase();
    	StringBuffer s1 = new StringBuffer(s);
    	s1=s1.append("*");
    	int i=0;
    	int j=1;
    	int del=0;
    	int x=0;
    	while(s1.charAt(j)!='*') 
    	{
    		if(s1.charAt(i)==s1.charAt(j)) {
    			del+=1;
    			j+=1;
    			x+=1;
    			
    		}
    		else {
    			i+=x+1;
    			j+=1;
    			x=0;
    	  		}
    		
    	}

        return del;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "ABBABBAA";
        

        int result = alternatingCharacters(s);
        System.out.println(result);
	}

}
