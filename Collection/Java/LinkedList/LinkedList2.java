
import java.util.*;

public class LinkedList2 {

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        // إنشاء Iterator
        Iterator<Integer> it = nums.iterator();

        // المرور على العناصر
        while (it.hasNext()) {

            // جلب العنصر الحالي
            int n = it.next();

            // طباعة العنصر
            System.out.println(n);

            // حذف العناصر الأصغر من 30
            if (n < 30) {
                it.remove();
            }
        }

        // طباعة القائمة بعد الحذف
        System.out.println(nums);
        Collections.sort(nums);
        Collections.sort(nums, Collections.reverseOrder());
        
    }
}

/*مقارنة Big O
العملية ArrayList LinkedList
get(index) O(1) O(n)
الإضافة في البداية O(n) O(1)
الإضافة في النهاية O(1) amortized O(1)
الحذف من البداية O(n) O(1)
البحث عن قيمة O(n) O(n)
*/
