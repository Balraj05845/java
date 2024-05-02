package javaprograms;
import java.util.*;
public class  linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList Q=new LinkedList();
Q.addFirst("hi");
Q.addFirst("hello");
System.out.println(Q);
Q.addLast("bye");
Q.addLast("hey");
System.out.println(Q);
	String a=(String)Q.getFirst();
	System.out.println(a);
	String aa=(String)Q.getLast();
	System.out.println(aa);
	Q.removeFirst();
	System.out.println(Q);
	Q.removeLast();
	System.out.println(Q);
	}
	

}
