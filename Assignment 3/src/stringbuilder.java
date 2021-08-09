
public class stringbuilder {

	public static void main(String[] args) {
		
		//for first- append case
		StringBuilder buffer=new StringBuilder("StringBuffer");
		buffer.append(" is a peer class of String");
		buffer.append(" that provides much of");
		buffer.append(" the functionality of strings.");
		System.out.println(buffer);
		
		//for second - insert case
		StringBuilder buffer1=new StringBuilder("It is used to at the specified index position");
		buffer1.insert(14, "insert text ");
		System.out.println(buffer1);
		
		//for third- reverse case
		StringBuilder buffer2=new StringBuilder("The method returns the reversed object on which it was called");
		buffer2.reverse();
		System.out.println(buffer2);

	}

}
