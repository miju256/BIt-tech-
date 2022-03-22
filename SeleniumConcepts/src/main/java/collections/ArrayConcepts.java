package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayConcepts {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("ruman");
		ar.add("miju");
		ar.add("zubayer");
		System.out.println(ar);
//		Iterator<String> name =ar.iterator();
//		while (name.hasNext()) {
//			System.out.println(name.next());
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("afzal");

		ar.addAll(ar1);
		System.out.println(ar);
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("baw");
		studentName.add("mahin");
		studentName.add("maruf");

		for (int i = 0; i < studentName.size(); i++) {
			System.out.println(studentName.get(i));
		}
		System.out.println("*********");
		ArrayList<String> beststudentName = new ArrayList<String>();
		beststudentName.add("afzal");
		beststudentName.add("mahin");
		beststudentName.add("maruf");
		for (String student : beststudentName) {
			System.out.println(student);
			System.out.println("*********");
			ArrayList<String> languages = new ArrayList<String>(Arrays.asList("java", "javascript "));

			Iterator<String> lanlist = languages.iterator();
			while (lanlist.hasNext()) {
				System.out.println(lanlist.next());
			}
	
		}
			
		
		


	}

}
