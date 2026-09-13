package Learn_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class Lean_List {

	public static void main(String[] args) {

		ArrayList<Object> l = new ArrayList<Object>();
		l.add("java");
		l.add('K');
		l.add(30);
		l.add(66.7);
		l.add("java");
		l.add(true);
		System.out.println(l);
		System.out.println(l.add("Python"));
		System.out.println(l);
		System.out.println(l.get(5));
		System.out.println(l.getLast());
		
		System.out.println(l.contains("java"));
		ArrayList<Object> al = (ArrayList) l.clone();
		
		System.out.println(al);
		System.out.println(al.add("React.js"));
		System.out.println(al);
		
		System.out.println(l.equals(al));
		
		System.out.println(l.indexOf(66.7));
		
		System.out.println(al.removeAll(al));
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		System.out.println(l.remove(2));
		System.out.println(l);
		
		System.out.println(l.removeFirst());
		System.out.println(l);
		
//		l.clear();
//		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.set(2, "C"));
		System.out.println(l);
		
//		System.out.println(l.reversed());
		Object ar[] = l.toArray();
//		System.out.println(ar[2]);
		for(Object v : ar) {
			System.out.println(v);
		}
		System.out.println("--------------------------");
		Iterator i = l.iterator();
//		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------------------------");
		
		Spliterator<Object> s = l.spliterator();
		s.forEachRemaining(q -> System.out.println(q) );
		
		
		

	}

}
