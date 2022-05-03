package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String text= "madam" ;
		String rev= " " ;
		for(int i=text.length()-1; i>=0; i--) {
			rev= rev + text.charAt(i);
		}
		if(text.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else
		{System.out.println("String is not palindrome");
	}
	}
}

