
public class CodingPractice {

	public static void main(String[] args) {
		//reverseANum(123);
		
		//reverseAString("Bangladesh");
		sumOfANum(456);
	}

	public static void reverseANum(int num) {
		int temp;
		temp = num;
		int sum = 0;

		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;

		}
		System.out.println("the reverser number is" + sum);
	}
	
	public static void reverseAString(String orig) {
		
		String rev="";
		for(int i =orig.length()-1; i>=0;i--) {
			rev= rev+orig.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
	public static void sumOfANum(int num) {
		int temp;
		temp =num;
		int sum =0;
		while(temp!=0) {
			int r =temp%10;
			sum = sum+r;
			temp =temp/10;
			}
		System.out.println("sum of the given num is "+sum);
		
		}
	
	
	public static void findfibonacci(int num) {//1 1 2 3 5
		int first=0 ;
		int second =1 ;
		int fibo= first+second ;
		for( int i = 0;i<=num ;i++) {
			fibo = first+second;
			second = first;
		}
		 
		 
		
		
		
	
	}
	
	






}
