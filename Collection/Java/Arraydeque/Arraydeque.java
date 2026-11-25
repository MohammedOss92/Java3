
import java.util.*;

public class Arraydeque {

    public static void main(String[] args) {

        // =================================
        // 1. ARRAYLIST
        // =================================

        ArrayList<Integer> a = new ArrayList<>();

        // إضافة في النهاية
        a.add(10);
        a.add(20);
        a.add(30);

        // إضافة في البداية
        a.add(0, 5);

        // إضافة في الوسط
        a.add(2, 15);

        // تعديل البداية والوسط والنهاية
        a.set(0, 100);
        a.set(2, 200);
        a.set(a.size() - 1, 300);

        // البحث
        System.out.println(a.contains(20));
        System.out.println(a.indexOf(20));

        // حذف البداية والوسط والنهاية
        a.remove(0);
        a.remove(2);
        a.remove(a.size() - 1);

        // العرض
        System.out.println("ArrayList: " + a);


        // =================================
        // 2. LINKEDLIST
        // =================================

        LinkedList<Integer> l = new LinkedList<>();

        // إضافة في النهاية
        l.add(10);
        l.add(20);
        l.add(30);

        // إضافة في البداية
        l.addFirst(5);

        // إضافة في الوسط
        l.add(2, 15);

        // تعديل البداية والوسط والنهاية
        l.set(0, 100);
        l.set(2, 200);
        l.set(l.size() - 1, 300);

        // البحث
        System.out.println(l.contains(20));
        System.out.println(l.indexOf(20));

        // حذف البداية والوسط والنهاية
        l.removeFirst();
        l.remove(2);
        l.removeLast();

        // العرض
        System.out.println("LinkedList: " + l);


        // =================================
        // 3. ARRAYDEQUE
        // =================================

        ArrayDeque<Integer> d = new ArrayDeque<>();

        // إضافة في النهاية
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);

        // إضافة في البداية
        d.addFirst(5);

        // إضافة عنصر في النهاية
        d.addLast(40);

        // البحث
        System.out.println(d.contains(20));

        // عرض البداية والنهاية
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        // حذف البداية
        d.removeFirst();

        // حذف النهاية
        d.removeLast();

        // العرض
        System.out.println("ArrayDeque: " + d);
    }
}
