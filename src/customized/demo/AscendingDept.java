package customized.demo;

import java.util.*;

public class AscendingDept implements Comparator <Employee> {
	
	public int compare(Employee e1,Employee e2)
	{
		
		return e1.dept.compareTo(e2.dept);
	}

}
