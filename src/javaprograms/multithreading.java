package javaprograms;

public class multithreading {

	public static void main(String[] args) {
one x=new one();
x.start();
try {
	x.join();	
}
catch(Exception ee) {
}
one x1=new one();
x1.start();

}
}
class one extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println(i);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
		}
	}
		
	}
}

