package javaprograms;

/*public class javafutures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
one x=()->{
	System.out.println("Hello....");
};
x.display();
	}

}
interface one{
	public void display();
}*/
interface two2{
	public void sho();
}
public class javafutures{
	public void name() {
		System.out.println("execute my name");
	}
	public static void main(String args[]){
		javafutures x=new javafutures();
		two2 ref=x::name;
		ref.sho();
	}
}	
	
		
		
	
	


