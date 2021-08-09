
public class stringbuffer {

	public static void main(String[] args) {
		
		//for first- append case
		StringBuffer buffer=new StringBuffer("StringBuffer");
		buffer.append(" is a peer class of String");
		buffer.append(" that provides much of");
		buffer.append(" the functionality of strings.");
		System.out.println(buffer);
		
		//for second - insert case
		StringBuffer buffer1=new StringBuffer("It is used to at the specified index position");
		buffer1.insert(14, "insert text ");
		System.out.println(buffer1);
		
		//for third- reverse case
		StringBuffer buffer2=new StringBuffer("The method returns the reversed object on which it was called");
		buffer2.reverse();
		System.out.println(buffer2);

	}

}
