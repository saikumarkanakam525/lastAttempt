package Introduction;
public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//one try can be followed by mutiplle catch blocks 
		//catch should be an immediate block after try
		int b=7;
		int c=0;
		try 
		{ 
			 int k=b/c;
			 // //int arr[]=new int[5];               
			 //System.out.println(arr[7]);  
			 System.out.println(k);
		} 
		catch(ArithmeticException et) 
		{ 
			System.out.println("I catched the Arthimetic/exception");
		} 
		catch(IndexOutOfBoundsException ets) 
		{ 
			System.out.println("I catched the IndexBound/exception");
		}
		catch(Exception e) 
		{ 
			System.out.println("I catched the error/exception"); } 
		finally //THis block is executed irrespective of exception thrown or not } 
		{ 
			System.out.println("delete cookies");
		}

	}	

}
