package Practice.Map;

import java.util.*;

public class ArrayListInHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, ArrayList<String>> lmap = new LinkedHashMap<>();

		ArrayList boys = new ArrayList();
		boys.add("rakesh");
		boys.add("suresh");
		boys.add("ganesh");

		ArrayList girls = new ArrayList();
		girls.add("jaya");
		girls.add("radha");
		girls.add("munni");

		lmap.put("Boys", boys);
		lmap.put("Girls", girls);

		Set<Map.Entry<String, ArrayList<String>>> set = lmap.entrySet();
		for(Map.Entry<String, ArrayList<String>> me:lmap.entrySet()) {
			
			System.out.println("=========="+me.getKey()+"===========");
			
			ArrayList al = me.getValue();
			
			for(Object obj:al) {
				System.out.println(obj);
			}
			
		}

	}
}
