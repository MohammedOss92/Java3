
import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {

        // إنشاء LinkedList
        LinkedList<Integer> nums = new LinkedList<>();

        // إضافة العناصر
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.addFirst(5);
        nums.addLast(50);
        nums.add(2, 25);
        nums.add(1,20);
        
        
        // جلب أول عنصر
        System.out.println(nums.getFirst());

        // جلب آخر عنصر
        System.out.println(nums.getLast());

        // جلب العنصر الموجود في الموقع 2
        System.out.println(nums.get(2));

        // طباعة العناصر باستخدام for
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // طباعة عدد العناصر
        System.out.println("Size: " + nums.size());
        nums.remove(2);
        nums.remove(Integer.valueOf(20));
        nums.removeFirst();
        nums.removeLast();
        nums.remove();
        System.out.println(nums);
        System.out.println(nums.contains(20));   // true

        System.out.println(nums.indexOf(20));    // 1

        System.out.println(nums.lastIndexOf(20)); // 3

        System.out.println(nums.isEmpty());      // false

        System.out.println(nums.size());         // 
    }
}

