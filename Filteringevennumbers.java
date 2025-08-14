package streamapi;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Filteringevennumbers {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(3);
		al.add(8);
		al.add(9);
		al.add(4);
		List<Integer> li = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("original list:" +al);
        System.out.println("original list:" +li);
        
		
	}

}
