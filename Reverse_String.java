package java20_StringFunctions;

public class Reverse_String {
	
	public static void main(String[] args) {
		String str= "shiva";		String rev = "";		String rev1 = "";

		
		//Method 1
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
			}
		
		
		// Method 2
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);				
		}
		System.out.println("\n" +rev);
		
		//method3
		char[] str1 = str.toCharArray();
		for(int j=str1.length-1; j>=0; j--) {
		System.out.print(str1[j]);
			
		rev1 = rev1+ str1[j];
			
		}
		System.out.println("\n" +rev1);

	}

}
