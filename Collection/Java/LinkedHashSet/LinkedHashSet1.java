
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> nums = new LinkedHashSet<>();

        nums.add(30);
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(40);

        System.out.println(nums);
        nums.remove(10);
nums.add(10);

System.out.println(nums);

Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
        
        
    }
}
