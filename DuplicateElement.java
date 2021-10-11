package FindDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(2,3,2,4,3,4,8,1);
		Set<Integer> set = new HashSet<Integer>();
        list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

	}
}
