package com.psl.demo;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionDemo {
	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		Set<String> list = new TreeSet<String>();
		//Set<String> list = new CopyOnWriteArraySet<String>();
		list.add("Ajinkya");
		list.add("Prasad");
		list.add("Akmal");
		list.add("Aniket");
		list.add("Akash");
		list.add("Aniket");
		list.add("Akash");

		System.out.println(list);
//		System.out.println(list.get(1));
		System.out.println(list.remove("Akash"));

/*		System.out.println("Simple for loop..");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/

		System.out.println("Foreach loop..");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("Iterator..");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Maps-");
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(4, "Amol");
		map.put(2, "Aniket");
		map.put(1, "Ajinkya");
		map.put(3, "Prasad");
		map.put(5, "Ajinkya");
		map.put(2, "Akmal");
		map.put(6, "Akash");
		
		System.out.println(map);
		
		Iterator<Integer> it1 = map.keySet().iterator();
		int i;
		while(it1.hasNext()){
			i=it1.next();
			System.out.println(i);
			System.out.println(map.get(i));
		}
		
		System.out.println("Using Entry");
		
		Set<Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> it2 = set.iterator();

		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
