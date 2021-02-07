package exp1;

import java.util.Hashtable;
import java.util.Map;

public class Hashtab {
	public static void main(String[] args) {
		Hashtable<Integer, String> ob=new Hashtable<Integer,String>();
		ob.put(1,"ram");
		ob.put(2,"syam");
		ob.put(3,"subham");
		System.out.println("Hash table size = "+ob.size());
		System.out.println("Hash table is = "+ob);
		for(Map.Entry m:ob.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}