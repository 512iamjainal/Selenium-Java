package day9;

public class StringVsStringBufferVsStringBuilder {
	
	public static void main(String[] args)
	{
		
		//String => immutable
		String s = "welcome";
		s="selenium";
		s.concat("to java");
		System.out.println(s);
		
		
		//StringBuffer
		StringBuffer sbf = new StringBuffer("welcome");
		sbf.append("to java");
		System.out.println(sbf);
		
		//StringBuffer
		StringBuilder sbr = new StringBuilder("welcome");
		sbr.append("to java");
		System.out.println(sbr);
		
	}

}
