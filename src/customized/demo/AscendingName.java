package customized.demo;

import java.util.*;

public class AscendingName implements Comparator<Employee> {
	
	public int compare (Employee e1, Employee e2)
	{
		return e1.name.compareTo(e2.name);
		
	}
	
//    public int compare(Employee e1 ,Employee e2)
//    {
//    	
//    	return -e1.name.compareTo(e2.name);   // desending order 
//    	
//    }
}
