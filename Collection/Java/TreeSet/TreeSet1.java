import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1{

    public static void main(String args[]){

TreeSet<Integer> nums = new TreeSet<>();
nums.add(30);
nums.add(10);
nums.add(20);
nums.add(10);
System.out.println(nums);
System.out.println(nums.contains(20));
System.out.println(nums.remove(30));
nums.add(40);
nums.add(50);
System.out.println(nums.size());
System.out.println(nums.first()); // أصغر عنصر
System.out.println(nums.last());  // أكبر عنصر

System.out.println(nums.lower(20));  // أكبر عنصر أصغر من 30
System.out.println(nums.higher(20)); // أصغر عنصر أكبر من 30
System.out.println(nums.floor(30));   // أكبر عنصر أصغر من أو يساوي 30
System.out.println(nums.ceiling(30)); // أصغر عنصر أكبر من أو يساوي 30
nums.pollFirst(); // يرجع ويحذف أصغر عنصر
nums.pollLast();  // يرجع ويحذف أكبر عنصر
nums.add(1);
nums.add(2);
nums.add(3);
System.out.println(nums.pollFirst());
System.out.println(nums.pollLast());
System.out.println(nums);

System.out.println(nums.descendingSet());

//الذي تغيّر هو ترتيب المرور فقط، وليس ترتيب المجموعة الأصلية.

//Iterator<Integer> it = nums.iterator();
Iterator<Integer> it = nums.descendingIterator();

while (it.hasNext()) {
    int n = it.next();
    System.out.println(n);
}

/*لكن لماذا نستخدم TreeSet رغم أن HashSet أسرع في البحث؟
لأن TreeSet توفر الترتيب التلقائي، وتسمح لنا بإيجاد أصغر وأكبر عنصر والعناصر الأقرب لقيمة معينة.*/
    }
}
