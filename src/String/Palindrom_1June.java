package String;

public class Palindrom_1June {
	
	public static void main(String[] args) {
		
		String s1= "abca";
		System.out.println(validPalindrome(s1));
		
	}
	
	
	    public static boolean validPalindrome(String s) {

	        String temp = s;
	        String res = "";
	        for(int i=s.length()-1 ; i>=0 ; i--) {
	            res = res + s.charAt(i);
	        }

	        if(temp.equals(res)){
	            return true;
	        } else {
	            return false;
	        }
	        
	    }
	

}
