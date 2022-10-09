package com.prowings;
import java.util.*;

public class NaturalSort {

	public static void main(String[] args) {
		
		Student s1 =new Student(10,"raghu");
		Student s2 =new Student(20,"subham");
		Student s3 =new Student(30,"sita");
		Student s4 =new Student(40,"geeta");
		
		TreeSet ts=new TreeSet();
		 ts.add(s3);
		 ts.add(s2);
		 ts.add(s4);
		 ts.add(s1);
		 System.out.println(ts);
		
	}
}
