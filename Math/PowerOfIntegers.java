Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 

Approach:
Run a from 1 till sqrt(A)
and similarly P (which is the power can run only till sqrt(A))
In the loop, when the power values exceed A, break the loop since we cannot find the number once the power value exceeds it

Solution:
public class Solution {
    public int isPower(int A) {
        if(A==1){
            return 1;
        }
        for(int a=1;a<=Math.sqrt(A);a++) {
    			for(int p=2;p<=Math.sqrt(A);p++) {
    				if(Math.pow(a, p)==A) {
    					return 1;
    				}else if(Math.pow(a, p)>A) {
    					break;
    				}
    			}
		}
        return 0;
    }
}
