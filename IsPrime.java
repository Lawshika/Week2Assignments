/* Iterate through all numbers from 2 to n-1 (input) and for every number check if it divides n 
(input). 
 If we find any number that divides, print non-prime.
 If nothing divides, then print prime*/
package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=11;
for (int i=2;i<=n-1;i++)
{
	if(n%i==0) {
		System.out.println("Given number is not a prime number"+n);
	break;
	}
	else{
		System.out.println("Given number is a prime number"+n);}
	break;
	}
	}

}
