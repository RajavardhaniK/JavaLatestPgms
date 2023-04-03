package arrayPgms;

public class MaximumElementInTheArray {


	public void findMinElementInTheArray() {
		int arr[]= {5,4,6,9,8,7};
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("largest element is " +largest);
	}
	public static void main(String[] args) {
		MaximumElementInTheArray minimumElementInTheArray = new MaximumElementInTheArray();
		minimumElementInTheArray.findMinElementInTheArray();
	}

}
