Exercise was done to get familiarity with Java
Given a string A.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.

Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.

If there are multiple spaces between words, reduce them to a single space in the reversed string.



Input Format

The only argument given is string A.
Output Format

Return the string A after reversing the string word by word.
For Example

Input 1:
    A = "the sky is blue"
Output 1:
    "blue is sky the"

Input 2:
    A = "this is ib"
Output 2:
    "ib is this"


Approach:
Use regex to clean up the string.
Start from the end and maintain two indexes start and end. Keep moving the start and once you hit a space, add substring from start to end to result
move the end_index. Once the loop finishes, add the first word to the result and return


Solution:
public class Solution {
    public String solve(String A) {
		String res = "";
		A = A.replaceAll("( +)", " ").trim();
		int end_index = A.length()-1;
		for(int start_index=A.length()-1;start_index>=0;start_index--) {
			if(A.charAt(start_index) == ' ') {
				//reverse the string from the i+1 to the start_index
				String rev = A.substring(start_index + 1, end_index+1);
				res = res.concat(rev);
				res = res.concat(" ");
				end_index = start_index - 1;
			}
		}
		res = res.concat(A.substring(0,end_index+1));
        return res;
    }
}

