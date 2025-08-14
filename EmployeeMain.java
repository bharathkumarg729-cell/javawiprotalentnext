package streamapi;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<FilteringEmployee> li=new ArrayList<FilteringEmployee>();
		li.add(new FilteringEmployee(100,"john",18000));
		li.add(new FilteringEmployee(200,"varun",10000));
		li.add(new FilteringEmployee(300,"riya",22000));
		List<FilteringEmployee> li2=li.stream().filter(emp -> emp.salary > 15000).collect(Collectors.toList());
		for(FilteringEmployee employee : li2) {
			System.out.println(employee.name);
		}
	}

}
