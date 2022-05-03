package week2.day1;

public class LearnString2 {
	public static void main(String[] args) {
		String text= "Testleaf is situated in twin towers teynampet";
		
		for(String word: text.split(" ")) {
			if(word.startsWith("t") || word.startsWith("T"))
		System.out.println(word);
	}
	}
}

