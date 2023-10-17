package test.collection;
//Count special char
//Remove special char
//Print special char
public class CountSpecial {
public static void main(String[] args) {
	String s="@a#3.,/ JGH&@\r\n"
			 ;
	int count=0;
	 String RSC="";
	 String sp="";
	for (int i = 0; i <s.length(); i++) {
		if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
			count++;
			sp=sp+s.charAt(i);
			
		}else {
		RSC=RSC+s.charAt(i);	 
		}
	}
	
	System.out.println("no of special "+count);
	System.out.println("except special "+RSC);
	System.out.println("only special " + sp);
}
}
