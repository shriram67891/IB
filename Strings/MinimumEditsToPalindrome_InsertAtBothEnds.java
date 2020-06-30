Same question as the previous one with just one caveat which says you can add it at both ends to make it a palindrome

Approach:
Recursion based. If len = 1, it is a palindrome
if len=2 and both are equal, then it is a palidrome, else you have to add a character in begin or end to make it a palindrome
If more than 2, and A[left] is different from  findMin of substring A[left+1,right] or A[left, right-1] + 1
Else findMin A[left+1,right-1]


Solution:
public class Solution {
    public static int findMinInsertions(String A,int left, int right) {
        if(left==right) {
            return 0;
        }
        if(left+1 == right) {
            if(A.charAt(left) == A.charAt(right)) {
                return 0;
            }else {
                return 1;
            }
        }
        if(left > right) {
            return Integer.MAX_VALUE;
        }
        if(A.charAt(left)==A.charAt(right)) {
            return findMinInsertions(A,left+1,right-1);
        }else {
            return (Math.min(findMinInsertions(A,left,right-1),findMinInsertions(A,left+1,right)) + 1);
        }
    }

    public int solve(String A) {
        return findMinInsertions(A,0,A.length()-1);

    }
}

