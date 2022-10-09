package customized.demo;

import java.util.*;

public class customSort {
	
	public static void main(String[] args) {
		
		           Employee e1= new Employee (30,"raj","Officer");
				   Employee e2= new Employee (40,"shahaji","Manager");
				   Employee e3= new Employee (50,"jijaii","CEO");
				   Employee e4= new Employee (60,"tarabai","Tester");
				 AscendingName n=new  AscendingName();
				 AcendngId i =new AcendngId();
				 AscendingDept d=new AscendingDept();
				 TreeSet ts=new TreeSet (n);
				 
				 ts.add(e1);
				 ts.add(e2);
				 ts.add(e4);
				 ts.add(e3);
				 
			System.out.println(ts);	 
	} 
}
