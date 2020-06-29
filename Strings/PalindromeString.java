Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Approach: Create a regex to match only alphanumeric and then convert the string to all caps or lowers and then do a palindrome check

Solution:

public class Solution {
    public int isPalindrome(String A) {
		A = A.replaceAll("[^A-Za-z0-9]", "");
		A = A.toLowerCase();
		for(int i=0,j=A.length()-1;i<A.length()&&j>=0&&i<=j;i++,j--) {
			if(A.charAt(i)!=A.charAt(j)) {
				return 0;
			}
		}
        return 1;
    }
}

