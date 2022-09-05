package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int length = str.length();
		String rev = "";
			for (int i = length-1 ; i>=0; i--) {
			rev = rev + str.charAt(i);
			}
			if(str.equals(rev)) {
			System.out.println("The string is palindrome");
			}
			else {
				System.out.println("This string is not palindrome");
				
			
			}
					}
			}
	
		
	


	
	

