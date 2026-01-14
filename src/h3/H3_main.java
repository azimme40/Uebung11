package h3;

public class H3_main {
	public static void main (String args []) {
		
	}
	public int [] mergesort (int [] a) {
		
		int [] b = new int [a.length]; 
		
		if (a.length == 1) {
			return a; 
		}
		
		int [] links = new int [a.length/2]; 
		int [] rechts = new int [a.length - links.length];
		
		for (int i = 0; i<links.length; i++) {
			
			links [i]= a[i];
		}
		for (int i = 0; i < rechts.length; i++) {
		    rechts[i] = a[i + links.length];
		}
		
		links = mergesort(links);
		rechts = mergesort(rechts);
		
		int i = 0; 
		int j = 0; 
		int k = 0;
		 while (i<links.length && j<rechts.length)
		 {
			 if (links [i]<= rechts [j]) {
				 b[k]= links[i];
				 i++;
			 }
			 else {
				 b[k] = rechts [j];
				 j++;
				 
			 }
			 k++;
		 }
		 while (i < links.length) {
			    b[k] = links[i];
			    i++;
			    k++;
			}

			while (j < rechts.length) {
			    b[k] = rechts[j];
			    j++;
			    k++;
			}
		
		
		return b;
		
	}
			
		
	

}
