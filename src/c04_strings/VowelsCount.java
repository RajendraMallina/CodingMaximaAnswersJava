package c04_strings;

public class VowelsCount {

	public static void main(String[] args) {
		
		String s = "coding maxima";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u')
			{
				count++;
			}
		}
		System.out.println("No of vowels in a string is " +count);
	}
}
