package OOP;

public class LearntryCatch {

	public static void main(String[] args) {
	  int i = 10;
	  int j = 0;
	  int k=0;
	  try {
		   k = i/j;
	  }
	  catch(Exception e)
	  {
		  System.out.println("Not divisible by 0"+e);
	  }

	}

}
