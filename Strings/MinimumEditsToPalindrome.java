Given an string A. The only operation allowed is to insert characters in the beginning of the string.

Find how many minimum characters are needed to be inserted to make the string a palindrome string.



Input Format

The only argument given is string A.
Output Format

Return the minimum characters that are needed to be inserted to make the string a palindrome string.
For Example

Input 1:
    A = "ABC"
Output 1:
    2
    Explanation 1:
        Insert 'B' at beginning, string becomes: "BABC".
        Insert 'C' at beginning, string becomes: "CBABC".

Input 2:
    A = "AACECAAAA"
Output 2:
    2
    Explanation 2:
        Insert 'A' at beginning, string becomes: "AAACECAAAA".
        Insert 'A' at beginning, string becomes: "AAAACECAAAA".

Approach:
Most important differntiator in the question in that you can add characters only at the beginning.
So if the first and end_index character do not match, increment 1 since you want to add it to the beginning of string to match it.
Keep doing this until the entire substring is a palindrome

Solution:
public class Solution {
    public int solve(String A) {
		int result = 0;
		int n=A.length();
		if(new StringBuffer(A).reverse().toString().equals(A)) {
			//see if it already a palindrome
			return 0;
		}else {
			for(int i=0;i<n;i++) {
				String temp = A.substring(0,n-1-i);
				result++;
				if(new StringBuffer(temp).reverse().toString().contentEquals(temp)) {
					break;
				}
			}
			return result;
		}
    }
}


