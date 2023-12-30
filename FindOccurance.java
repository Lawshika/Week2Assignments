/*Your task is to count the occurrences of character ‘e’ in the given String input="TestLeaf".
Requirements: 
- Create a class with a main method.
- Initialize a variable to 0.
- Convert the given String to a character array.
- Use loop to iterate through each character in the array.
- Compare each character with the target character.
- If a match is found, increment the count.
- Finally, print the coun*/
package week2.day2;



public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="TestLeaf";
		int count=0;
		char []charArray=input.toCharArray();
		for (int i=0; i<input.length();i++)
		{
			if(input.charAt(i)=='e')
			{
				count++;
			}
		}
				System.out.println("The occurance Of e is"+count);
				
			}
		}