package Objectclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put("name","karthik");
		map.put("Qualification", "BE/EEE");
		map.put("age", "28");
		map.put(true,null);
		map.put(1,10);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(101, "AAA");
		h1.put(102, "BBB");
		h1.put(103, "CCC");
		System.out.println(h1.get(101));
		
		Set set = h1.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		h1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		PriorityQueue q = new PriorityQueue<>();
		q.add(123);
		q.add(222);
		q.add(100);
		System.out.println("Size "+q.size());
		System.out.println("Peak "+q.peek());
		System.out.println("poll"+q.poll());
		System.out.println("Size "+q.size());
		System.out.println("poll"+q.peek());
		System.out.println("Remove"+q.remove());
		System.out.println("Size "+q.size());
		System.out.println("poll"+q.peek());

	}

}
