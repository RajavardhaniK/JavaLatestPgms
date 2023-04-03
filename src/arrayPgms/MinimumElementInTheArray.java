package arrayPgms;

public class MinimumElementInTheArray {


	public void findMinElementInTheArray() {
		int arr[]= {5,4,6,9,8,7};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("Smallest element is " +smallest);
	}
	public static void main(String[] args) {
		MinimumElementInTheArray minimumElementInTheArray = new MinimumElementInTheArray();
		minimumElementInTheArray.findMinElementInTheArray();
	}

}
