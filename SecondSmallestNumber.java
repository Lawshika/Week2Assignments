//Find the Second smallest number in the array {23,45,67,32,89,22 }
package week2.day1;

import java.util.Arrays;


public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num= {23,45,67,32,89,22};
Arrays.sort(num);
int num1=num[1];
System.out.println("The second smallest number is "+num[1]);

	
}
}
