package exp1;

import java.util.ArrayList;

public class ArList {
	public static void main(String[] args){
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(800);
		ob.add(3);
		ob.add(100);
		ob.add(9);
		ob.add(5);
		System.out.println("Arraylist after insertion:"+ob);
		ob.remove(4);
		System.out.println("Array list after removing 34(using index value):"+ob);
		ob.add(2,0);
		System.out.println("Arraylist after adding new element at 2nd index with 0:"+ob);
	}

}
