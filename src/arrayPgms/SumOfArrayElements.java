package arrayPgms;

public class SumOfArrayElements {

	public void usingIteration() {
		int arr[]= {5,4,3,9,8,7};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array of elements : "+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println("each value sum is : "+sum);

		}
		System.out.println("Sum of array elements : "+sum);
	}
	
	public void usingForEachLoop() {
		int arr[]= {5,4,3,9,8,7};
		int sum=0;
		
		for (int i : arr) {
			System.out.println("Array of elements : "+ i);
		}
		
		
		for (int i : arr) {
			sum=sum+i;
			System.out.println("each value sum is : "+sum);

		}
		System.out.println("Sum of array elements : "+sum);
	}
	
	
	public static void main(String[] args) {
		SumOfArrayElements sumOfArrayElements =new SumOfArrayElements();
		sumOfArrayElements.usingIteration();
		sumOfArrayElements.usingForEachLoop();
}
}
