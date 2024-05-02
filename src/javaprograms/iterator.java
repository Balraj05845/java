package javaprograms;
import java.util.*;
public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector m=new Vector();
m.addElement("jangam");
m.addElement("peddemul");
m.addElement("tandur");
System.out.println(m);
m.remove("peddemul");
System.out.println(m);
System.out.println(m.get(0));
Iterator ii=m.iterator();
int i=0;
while(ii.hasNext())
{
	Object x=ii.next();
	if(i==0) {
		ii.remove();
		System.out.println("removed jagam");
	}i++;
		
	}
System.out.println(m);
}

	}



