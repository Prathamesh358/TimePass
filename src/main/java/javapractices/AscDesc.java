package javapractices;

public class AscDesc {

	public static void main(String[] args) {
		
		int arr[] = {5,20,4,50,100,200,150};
		
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		System.out.println("Sorting the array in ascending order");
		
		for (int k = 0; k<arr.length; k++) {
			
			for(int l = k+1; l<arr.length; l++) {
				
				if(arr[k] > arr[l]) {
					int c = arr[k];
					arr[k] = arr[l];
					arr[l] = c;
				}
			}
			
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Sorting the array in descending order");
		
		for (int p = 0 ; p<arr.length; p++) {
			for (int q = p+1; q< arr.length; q++) {
				
				if(arr[p]<arr[q]) {
					int s = arr[p];
					arr[p] = arr[q];
					arr[q] = s;	
				}	
			}	
		}
		for (int z = 0; z<arr.length; z++) {
			System.out.println(arr[z]);
		}
		
	}

}
