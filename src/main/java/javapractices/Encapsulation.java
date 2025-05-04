package javapractices;

class GetAndSet{
	private int a;
	private int b;
	
	
	public void setA(int a) {
		this.a =a;
	}
	
	public int getA() {
		System.out.println("The Value of a is been set is "+ this.a);
		return a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		System.out.println("The Value of a is been set is "+ this.b);
		return b;
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		
		GetAndSet getAndSet = new GetAndSet();
		getAndSet.setA(20);
		getAndSet.getA();
		
		getAndSet.setB(50);
		getAndSet.getB();
		
		
	}

}
