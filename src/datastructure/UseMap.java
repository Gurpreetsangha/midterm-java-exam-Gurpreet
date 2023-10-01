package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */

		HashMap<String,String> capitalCities=new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		System.out.println("---------------for each loop---------------");

		for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println("------------------while loop with iterator-----------------");

		Iterator iterator=capitalCities.entrySet().iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("----------------List<String> into a Map------------------");

		Map<String,List<String>> list =new HashMap<String, List<String>>();

		ArrayList<String> queens =new ArrayList<String>();
		queens.add("Richmond hill");
		queens.add("Jamaica");
		queens.add("South ozone park");
		queens.add("hillside");

		list.put("Queens",queens);
		System.out.println(list);

		System.out.println(list.get("Queens"));
	}

}
