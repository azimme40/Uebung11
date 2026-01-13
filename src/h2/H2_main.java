package h2;

public class H2_main {
	public static void main (String args[]) {
		int n =40;
		benchmark(n);
	}
	
	
	public static void benchmark(int n)
	{
		long start, end;

        start = System.nanoTime();
         fibonacci(n);
        end = System.nanoTime();
        System.out.println("Elapsed nanoseconds: " + (end - start));

        start = System.nanoTime();
        fibonacciCached(n);
        end = System.nanoTime();
        System.out.println("Elapsed nanoseconds: " + (end - start));

        start = System.nanoTime();
        fibonaccischleife(n);
        end = System.nanoTime();
        System.out.println("Elapsed nanoseconds: " + (end - start));
    }
	
	public static long fibonacci (int n) {
		
		
		if (n ==0) {
			
			return 0; 
		}
		
		if (n == 1){
			
			return 1;
		}
		return fibonacci (n-1) + fibonacci(n-2);  

	}
	
	public static long fibonacciCached (int n) {
		
		long [] speicher = new long [1000];
		
		if (n ==0) {
			
			return 0; 
		}
		if (n == 1){
			
			return 1;
		}
		 if (speicher [n] != 0) {
			 return speicher [n];
			 
		 }
		 
		speicher [n] = fibonacci (n-1) + fibonacci(n-2);
		return speicher [n];
	}
	
	public static long fibonaccischleife (int n) {
		long F1 =1; 
		long F2 =1;
		long Fnext = 0;
		
		if (n <=2) {
			return 1;
		}
		
		for (int i = 3; i<= n; i++) {
			
			Fnext = F1 + F2; 
			F1 = F2; 
			F2 = Fnext; 

		}
		return F2; 
		}
	}

	


