package OOP;

public class tryCatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a = new A();
		a.function();
	}
	
}
class A {
	int i = 10;
	int j =0;
	int k = i/j;
	void function() throws Exception{
		throw new Exception("This is exception");
	}
}
