package javaprograms;

public class multithreadinsetpriority {

	public static void main(String[] args) {
	three z=new three();
	z.start();
	z.setPriority(1);
	three z1=new three();
	z1.start();
	z1.setPriority(10); 

	}

}
class three extends Thread{
	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println(i);
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread());
		}
			catch(Exception e)
		{
		}
		
		}
	}
