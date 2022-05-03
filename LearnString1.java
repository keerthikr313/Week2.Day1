package week2.day1;

public class LearnString1 {
	public static void main(String[] args) {
		String text="testleaf";
		int number=0;
		
		for(int i=0 ; i< text.length(); i++) {
			if (text.charAt(i)=='e')
			number++;
		}
		
		System.out.println("Number of e=" +number);
			
			
		}
		
	}


