package OOP;

public class Constructor {
	//Attributes of Constructor Class
	int first;
	int second;
	int sum;
	public Constructor(int first,int second)
	{
		this.first = first;
		this.second = second;
		this.sum = this.first+this.second;
	}
	public static void main(String[] args) {
     //Constructor c = new Constructor();
     //		c.first = 12;
     //		c.second = 11;
     //		System.out.println(c.first+c.second);
	  Constructor c = new Constructor(12,21);
	  System.out.println(c.sum);
	}
	//Note :Constructor does'nt have Return type.
}
