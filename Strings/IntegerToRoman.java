Given an integer A, convert it to a roman numeral, and return a string corresponding to its roman numeral version

 Note : This question has a lot of scope of clarification from the interviewer. Please take a moment to think of all the needed clarifications and see the expected response using “See Expected Output” For the purpose of this question, https://projecteuler.net/about=roman_numerals has very detailed explanations. 


Input Format

The only argument given is integer A.
Output Format

Return a string denoting roman numeral version of A.
Constraints

1 <= A <= 3999
For Example

Input 1:
    A = 5
Output 1:
    "V"

Input 2:
    A = 14
Output 2:
    "XIV"

Approch:
Create a hashmap for the roman variables. Special cases arise only for 4 and 9. So create an entry for 4,9,40,90,400,900 in the hashmap as well.
Traverse the number from left to right. Based on the number in the place, add appropriate roman numerals to the strings.

public class Solution {
    public String intToRoman(int A) {

		HashMap<Integer,String> my_map = new HashMap<Integer,String>();
		my_map.put(1,"I");
		my_map.put(4,"IV");
		my_map.put(5,"V");
		my_map.put(9,"IX");
		my_map.put(10,"X");
		my_map.put(40,"XL");
		my_map.put(50,"L");
		my_map.put(90,"XC");
		my_map.put(100,"C");
		my_map.put(400,"CD");
		my_map.put(500,"D");
		my_map.put(900,"CM");
		my_map.put(1000,"M");
		
		String res = "";
		//convert to string and the get the length
		String str_num = Integer.toString(A);
		int len = str_num.length();
		for(int i=0;i<len;i++) {
			if(str_num.charAt(i)=='1' || str_num.charAt(i)=='2'||str_num.charAt(i)=='3') {
				int times = Integer.parseInt(String.valueOf(str_num.charAt(i)));
				for(int j=1;j<=times;j++) {
					res = res.concat(my_map.get((int)Math.pow(10,len-1-i)));
				}
			}else if(str_num.charAt(i)=='4') {
				res = res.concat(my_map.get(4*(int)Math.pow(10,len-1-i)));				
			}else if(str_num.charAt(i)=='5') {
				res = res.concat(my_map.get(5*(int)Math.pow(10,len-1-i)));				
			}else if(str_num.charAt(i)=='6' ||str_num.charAt(i)=='7'||str_num.charAt(i)=='8') {
				res = res.concat(my_map.get(5*(int)Math.pow(10,len-1-i)));
				int times = Integer.parseInt(String.valueOf(str_num.charAt(i)));
				for(int j=5;j<times;j++) {
					res = res.concat(my_map.get((int)Math.pow(10,len-1-i)));
				}				
			}else if(str_num.charAt(i)=='9') {
				int temp = (9*(int)(Math.pow(10, len-1-i)));
				String my_str = my_map.get(temp);
				res = res.concat(my_str);								
			}
		}
		
    return res;
        
    }
}

