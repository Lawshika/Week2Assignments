//- Convert the given String to a character array.
//- Implement a loop to iterate through each character of the String (from end to start).
//- Print the characters to display the reversed String.
//Your task is to reverse a given String with the Input : String companyName= TestLeaf
package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String companyName= "TestLeaf";
char [] charArray=companyName.toCharArray();
for (int i=charArray.length-1;i>=0;i--) {
	
		System.out.println(charArray[i]);
	}
}
 
	}


