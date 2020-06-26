Problem Description

Given a positive integer A, return its corresponding column title as appear in an Excel sheet.



Problem Constraints
1 <= A <= 1000000000



Input Format
First and only argument is integer A.



Output Format
Return a string, the answer to the problem.



Example Input
Input 1:

 A = 1
Input 2:

 A = 28


Example Output
Output 1:

 "A"
Output 2:

 "AB"


public class Solution {
    public String convertToTitle(int A) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(7, "G");
		map.put(8, "H");
		map.put(9, "I");
		map.put(10, "J");
		map.put(11, "K");
		map.put(12, "L");
		map.put(13, "M");
		map.put(14, "N");
		map.put(15, "O");
		map.put(16, "P");
		map.put(17, "Q");
		map.put(18, "R");
		map.put(19, "S");
		map.put(20, "T");
		map.put(21, "U");
		map.put(22, "V");
		map.put(23, "W");
		map.put(24, "X");
		map.put(25, "Y");
		map.put(0, "Z");
        
		int num = A;
		String res = "";
		while(num>0) {
			if(num==26) {
				res = res.concat("Z");
				break;
			}
			int rem = num%26;
			String value = (String)map.get(rem);
			res = res.concat(value);
			if(rem==0) {
				num = num - 1;
			}
			num = num/26;
		}

		String reverse = new StringBuffer(res).reverse().toString();
     return reverse;        
        
    }
}
 
