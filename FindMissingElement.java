/*Assignment Details: 
Find the missing element in the given array 
Input -> {1, 4,3,2,8, 6, 7}; 
Output -> 5*/

package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,4,3,2,8,6,7};
	Arrays.sort(a);


for (int i=0; i<=a.length-1; i++){
	if (a[i]!=i+1) {
	System.out.println("The missing Element in the given array is "+(i+1));
break;
}}
}
}