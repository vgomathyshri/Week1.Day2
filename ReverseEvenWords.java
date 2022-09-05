package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
		String [] split = text.split(" ");
	
		
			for (int i = 0; i < split.length; i++) {
			if (i%2 == 0) {
				System.out.print(split[i] + " ");
			}else {
				String str = split[i];
				int leng;
				char[] charArray2 = str.toCharArray();
				leng = charArray2.length;
				for (int j = leng-1; j>=0; j--) {
					System.out.print(charArray2[j]);
				}
				System.out.print(" ");		
					}
			}
	}
}
				
				
//		             char[] charArray = split[i].toCharArray();
//					int length = charArray.length;
//				char[] charArray = str.toCharArray();
//                  	for (int j = length-1; j >= 0; j--) {
//						System.out.print(charArray[j] );
//					}
//
				


				
				
			
			
		
			
		
	


