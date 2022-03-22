
public class StringAndStringBuffer {

	public static void main(String[] args) {
	String s= "Bangladesh";
		String s1= "England";
System.out.println(s1.concat(s));
	String string = new String("India");
	System.out.println(string.concat(s));
		String s3 = new String("How Are you ");
		String s4=	s.concat("doing?");
s.concat("Doing Ishrak?");//You can not use object reference to add a new String in String class.

		//System.out.println(s.concat(s));
	System.out.println(s1);
	System.out.println(s);
	s.concat("you Ruman?");// With the object reference you can not concatenate new  String.
	StringBuffer sb= new StringBuffer("How Are You ");
sb.append("doing?");
	System.out.println(sb);
	StringBuffer zubayer=sb.append("Doing Zubayer?");
	System.out.println(zubayer);
	System.out.println(sb.charAt(4));
	System.out.println("Bangladesh".compareTo("India"));
	int number =sb.charAt(5);
	System.out.println(number);
	
	
	}

}
