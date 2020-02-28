package programs;

public class PatternJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n= 5;
//		for(int i =1; i<=n;i++) {
//			
//			for(int j=n-1; j>=i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=i; k>=1; k--) {
//					
//					System.out.print(k);
//				}
//				System.out.println();	
//			}
	    
	    
	    int n=5;
	    for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
		
	}
}

