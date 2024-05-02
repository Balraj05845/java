package javaprograms;

public class multithreading1 {

	public static void main(String[] args) {
	two y=new two();
	y.start();
	two y1=new two();
	y1.start();

	}

}
 class two extends Thread{
	 public void run() {
		 for(int i=0;i<=10;i++)
			 System.out.println(i);
		 try {
			 Thread.sleep(2000);
			 System.out.println(Thread.currentThread());
		 }
		 catch(Exception e) {
			 
		 
		 }
	 }
	
}
