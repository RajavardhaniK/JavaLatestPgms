package setExample;

import java.util.TreeSet;

public class TreeSett123{	
	public void treeSetExample(){
		//Creating object
		TreeSet treeSet= new TreeSet() ;
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
		
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	TreeSetExample treeSetExample= new TreeSetExample();
	treeSetExample.treeSetExample();
}
}
