package Demo;

public class SwapString {

	public static void main(String[] args) {
		String s="Welcome To Test Yantra";
		String[]s1=s.split(" ");
		String temp=s1[s1.length-1];
		s1[s1.length-1]=s1[0];
		s1[0]=temp;
		for(String sr:s1)
		{
			System.out.print(sr+" ");
		}	
	}

	}


