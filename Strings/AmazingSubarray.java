You are given a string S, and you have to find all the amazing substrings of S.

Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is number of Amazing Substrings in given string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
	Amazing substrings of given string are :
	1. A
	2. AB
	3. ABE
	4. ABEC
	5. E
	6. EC
	here number of substrings are 6 and 6 % 10003 = 6.


Approach:
Start from the end and keep moving backwards. When you encounter a vowel, the number of possible combinations will be length of the string - index.
Keep aggregating the count and return

Solution:
public class Solution {
    public int solve(String A) {
		A = A.toUpperCase();
		long result=0;
		for(int i=A.length()-1;i>=0;i--) {
			if((A.charAt(i)=='A')||(A.charAt(i)=='E')||(A.charAt(i)=='I')||(A.charAt(i)=='O')||(A.charAt(i)=='U')) {
				result = result + (A.length() - i);
			}
		}
        return (int)(result%10003);        
    }
}

