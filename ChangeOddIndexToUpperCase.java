package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = new String("changeme");
		
		char[] charArray = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			char ch =charArray[i];
			
					
			if(i%2 != 0) {
				
				
				System.out.print(Character.toUpperCase(ch));
			}
			else
			{
					System.out.print(ch);
				}
			    			 
			}
			}

	}


