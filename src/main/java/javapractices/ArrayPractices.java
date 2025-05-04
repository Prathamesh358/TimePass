package javapractices;



public class ArrayPractices {

	public static void main(String[] args) {
		
//		int arr[] = {10,30,70,50,70,40,70};
//		int count =0;
		
//		for (int i = 0;i <arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//		for (int j = arr.length - 1; j >= 0; j--) {
//			System.out.println(arr[j]);
//		}
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 70) {
//				count = count + 1;
//			}	
//		}
//		System.out.println("count of 70 : "+ count);
		
		int arr[][] = {{10,30,70},{50,70,40},{70,20,30}};
		int count =0;
		
//		for (int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr.length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				
				if(i==j) {
					count = count + arr[i][j];
				}
			}
		}
		System.out.println("total of diagonal elements is : "+ count);
		
		
	}

}
