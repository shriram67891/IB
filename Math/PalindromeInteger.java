Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False

Approach:
Count the number of digits in the number. 
Calculate reverse sum using digits and see if it adds to the original number.If yes, it is a palindrome integer, else not a palindrome integer.

public class Solution {
    public int isPalindrome(int A) {
		int num_of_digits = 0;
		int temp = A;
		//first count the total digits in the number
		while(temp>0) {
			temp = temp/10;
			num_of_digits++;
		}

		//calculate the sum by reversing the digits and see if it adds up to the orginal
		temp = A;
		int reverse = 0;
		int i = 1;
		while(temp > 0) {
			int rem = temp%10;
			reverse = (int) (reverse + rem*(Math.pow(10, num_of_digits-i)));
			i++;
			temp = temp/10;
		}
       		 if(A==reverse){
	            return 1;
        	}else{
            	    return 0;
        	}
    }
}
