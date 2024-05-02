package javaprograms;
import java.util.*;
public class listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector r=new Vector();
r.addElement("hi");
r.addElement("hello");
r.addElement("chuchu");
r.addElement("boow");
System.out.println(r);
System.out.println(r.get(2));
ListIterator<String>iterator=r.listIterator();
System.out.println("forward direction");
while(iterator.hasNext()) {
	String abc=iterator.next();
	System.out.println(abc);
}
while(iterator.hasPrevious()) {
	String cde=iterator.previous();
	System.out.println(cde);
	}

}
}
