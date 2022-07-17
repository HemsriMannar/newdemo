package hello;
import java.util.Scanner;
import java.util.StringTokenizer;

	public class StringVowels {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter any Sentence");
			String userString = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(userString," ");
			System.out.println(st);
			
			System.out.println("Vowel count of each word in the given sting are: ");
			
			while(st.hasMoreTokens())
			{
				String word = st.nextToken();
				System.out.println("Processing Word: "+ word);
				
				int vowelCount = 0;
				for(char c: word.toCharArray()) {
					c = Character.toLowerCase(c);
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
						vowelCount++;
					}
					
				}
				System.out.println("The vowel count of the "+word+"is :"+ vowelCount+ "vowels");
			}

		}
}
