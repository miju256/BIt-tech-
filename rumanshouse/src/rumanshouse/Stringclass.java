package rumanshouse;

public class Stringclass {
	public static void main(String[] args) {
		//revaString("afzal");
		//duplicateofarray();
		//fizzBuzz();
		//isPlaindrome();
		faboNum(7 ) ;
	}

	public static void revaString(String orig) {
		String rev = "";
		for (int i = orig.length() - 1; i >= 0; i--) {
			rev = rev + orig.charAt(i);
		}
		System.out.println("rev of the original string is " + rev);
	}

	// a live in bangladesh

	public static  void duplicateofarray() {

		String orig = "i live in bangladesh";
		char charArray[] = orig.toCharArray();
		for (int i = 0; i < orig.length(); i++) {
			for (int j = i + 1; j < orig.length(); j++) {

				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
				}

			}

		}

	}
	
	
	
	public static void fizzBuzz() {
		int num=100;
		for(int i=1 ;i<=num ;i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i+"fiz buzz");
				
			}else if(i%5==0) {
				System.out.println(i+"buzz");
			}else if (i%3==0) {
				System.out.println(i+"fizz");
			}
			
		}
		
	}
	
	public static void isPlaindrome() {
		String orig = "boob";
		
		String rev="";
		for(int i =orig.length()-1;i>=0; i --) {
		rev = rev+orig.charAt(i);
		}
		//System.out.println(rev);
		if (orig.equals(rev) ) {
			System.out.println("this is plindrome ");
		}else {
		System.out.println("this is not palindrome");
		}
		
		
	}
	
	public static void faboNum(int num ) { ///1 2 3 5 8
		int first= 1;
		int second =2;
		int fibo ;
		for (int i=1;i<=num;i++) {
			fibo =first+second;
			first =second;
			second = fibo;
			System.out.println(fibo);
					
			
		}
		
				
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
