
public class stringclass {

	public static void main(String[] args) {
		//1. 
		String str="Hello World";
		int len=str.length();
		System.out.println("length of string is "+len);
		//2.
		String str1="Hello,";
		String str2="How are you?";
		String str3=str1.concat(str2);
		System.out.println(str3);
		String str4="Java string pool refers to collection of Strings which are stored in heap memory";
		//.3 a)
		String str5=str4.toLowerCase();
		System.out.println(str5);
		//.3 b)
		String str6=str4.toUpperCase();
		System.out.println(str6);
		//.3 c)
		String str7=str4.replace("a", "$");
		System.out.println(str7);
		//.3 d)
		System.out.println(str4.contains("collection"));
		//.3 e)
		System.out.println(str4.equals("java string pool refers to collection of strings which are stored in heap memory"));
		// 3 f)
		System.out.println(str4.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
		
	}

}
