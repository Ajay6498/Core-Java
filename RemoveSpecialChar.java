public class RemoveSpecialChar {
   public static void main(String[] args) {

		String s = "J$ay Ga@ne&sh";
		int count = 0;
		String RemoveSpecialChar="";
		
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))  ) {
				count++;
			}else {
				RemoveSpecialChar=RemoveSpecialChar+s.charAt(i);
			}
		}
		//count special char
		System.out.println("special char found : " + count );
		//remove special char and print
		System.out.println("RemoveSpecialChar : " +RemoveSpecialChar);
	}
}
//Input : J$ay Ga@ne&sh
//Output : Jay Ganesh
