Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 

Approach:
Keep two indexes one from 2 and other from number-2
Check for prime of both indexes. If both are prime return. else increment starting index and decrement ending index
Checking for prime number. make sure you have the loop running from 2 to sqrt(number) for optimization purposes

public class Solution {

	public boolean isPrime(int n) {
		if(n<2){
		    return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

    public ArrayList<Integer> primesum(int A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i,j;
		for(i=2,j=A-2;i<=j;i++,j--) {
			if(isPrime(i)&&isPrime(j)) {
                result.add(i);
                result.add(j);
				break;
			}
		}
		return result;
    }
}
