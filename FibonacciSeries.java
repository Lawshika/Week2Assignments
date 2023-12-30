/*To find Fibonacci Series for a given range
input(range): 8 
Requirements:
 User input for the desired range of the Fibonacci series.
 Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.*/
package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=8;
	int c;
	for(int i=1;i<=n;i++)
	{
		c=b+a;
		a=b;
		b=c;
		System.out.println(c);
	}

}}
