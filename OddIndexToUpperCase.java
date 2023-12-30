/*Change the odd index of a given String to uppercase with the input : String test = “changeme”;
 
Requirements: 
- Convert the given String to a character array.
- Implement a loop to iterate through each character of the String (from end to start).
- Find the odd index within the loop
- Inside the loop, change the character to uppercase only if the index is odd
- Print the characters with the expected output: cHaNgEmE*/

package week2.day2;



public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="changeme";
char [] charArray=test.toCharArray();
System.out.println(test.length());
for (int i=0;i<=(test.length()-1);i++)
{
	if(i%2==1)
{
	charArray[i]=Character.toUpperCase(charArray[i]);
}
	System.out.println(""+charArray[i]);
	}
}
	}


