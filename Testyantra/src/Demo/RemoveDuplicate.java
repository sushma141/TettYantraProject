package Demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate{

	public static void main(String[] args) {
		String s="Welcome To Test Yantra";
		System.out.println(removeDuplicate(s)+" ");
	}
	public static String removeDuplicate(String s)
	{
		Set<Character>set=new LinkedHashSet<>();
		StringBuffer sf=new StringBuffer(); 
		
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
			}
		
		return sf.toString();
	}
}
		


	

			
							
				
	


