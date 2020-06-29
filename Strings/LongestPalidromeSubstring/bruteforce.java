Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"

Bruteforce Method Approach:
For every index find the string, find the longest palindrome. Keep track of the longest and return it

public class Solution {

	public static String getLongestPalindrome(String A,int start_index) {
		String result = "";
		for(int i=A.length()-1;i>start_index;i--) {
			int strt_index = start_index;
			if(Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(A.charAt(start_index))) {
				int j = i-1;
				boolean flag = true;
				while(strt_index<=j) {
					if(A.charAt(j)!=A.charAt(strt_index+1)){
						flag = false;
						break;
					}else {
						strt_index++;
						j--;
					}
				}
				if(flag == true) {
					// it is a valid palindrome substring
					String temp_result = A.substring(start_index,i+1);
					//check if this is the longest substring
					if(temp_result.length() > result.length()) {
						result = temp_result;
					}
				}
				//if flag is false then it is not a palindrome
			}
		}
		return result;
	}
	
    public String longestPalindrome(String A) {
		String result = "";
		for(int i=0;i<A.length()-1;i++) {
			//check for the longest palindomatic substring for index i
			String temp = getLongestPalindrome(A,i);
			if(temp.length() > result.length()) {
				result = temp;
			}
		}
		//if there are no palindromes found return the first character as result
		if(result.length()==0){
		    return A.substring(0,1);
		}
        return result;
    }
}

