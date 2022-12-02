
public class DivideByExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.Println("Main methods Begins");
		try {
			System.out.println(12/0);
			System.out.println("try ends");
		}
		catch(Exception ae) {
			ae.PrintStackTrace();
			
		}
		
System.out.println("Main methods Ends");
	}

}
