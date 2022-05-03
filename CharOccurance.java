package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		
		//check number of occurences of a char(eg 'e') in a string
		//declare and initialize a variable count to store the number of occurences
		//convert the string into char array
		//get the length of the array
		//traverse from 1 till the array length
	    //check the char array has the particular char in it 
	    //if is has increment the count
	    //print the count out of the loop
		
		String str ="welcome to Chennai";
		int count =0;
		for(char ch:str.toCharArray()) {
			if(ch=='e')
			{
				count++;
			}
		}
		System.out.println(count);
	
		
	}

}
