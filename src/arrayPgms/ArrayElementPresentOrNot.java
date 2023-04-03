package arrayPgms;

import java.util.stream.IntStream;

public class ArrayElementPresentOrNot {

	public void usingForEachLoopPresentorNot() {
		int arr[]= {5,4,6,9,8,7};
		int numToFind=5;
		boolean found= false;

			for (int i : arr) {
			System.out.println("Array of elements : "+ i);
		}


		for (int traveseelement : arr) {
			if (traveseelement==numToFind)
			{
				found=true;
				break;
			}
		}
		System.out.println("Found value is :" +found);
		if(found)
		{
			System.out.println("Element found");

		}else
		{
			System.out.println("Element not found");

		}

	}
	public void usingIntStream()
	{
		int arr[]= {5,4,6,9,8,7};
		int numToFind=88;
		boolean found= IntStream.of(arr).anyMatch(ele -> ele ==numToFind);
		if(found)
		{
			System.out.println("Element found");

		}else
		{
			System.out.println("Element not found");

		}
	}


	public static void main(String[] args) {
		ArrayElementPresentOrNot arrayElementPresentOrNot = new ArrayElementPresentOrNot();
		arrayElementPresentOrNot.usingForEachLoopPresentorNot();
		//arrayElementPresentOrNot.usingIntStream();
	}

}
