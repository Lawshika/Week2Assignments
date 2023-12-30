//Requirements:
//a) Create a class by name: FindDups (with main method) in same package
//b) Create a int[] array with duplicate data
//c) Write a logic to find the duplicate values
//d) Run and confirm the duplicate values are printed in console
package week2.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num= {2, 5, 7, 7, 5, 9, 2, 3};
Arrays.sort(num);
System.out.println("The duplicate numbers are");
for (int i = 0; i < num.length-1; i++) {
	if (num[i]==num[i+1])
	{
		System.out.println(num[i]);
	}
}
	}

}
