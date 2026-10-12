package string.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Hello World Java";

        // 1. length()
        System.out.println(s.length());

        // 2. charAt()
        System.out.println(s.charAt(1));

        // 3. toCharArray()
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        // 4. split()
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        // 5. substring()
        System.out.println(s.substring(0, 5));

        // 6. indexOf()
        System.out.println(s.indexOf("World"));

        // 7. lastIndexOf()
        System.out.println(s.lastIndexOf("a"));

        // 8. contains()
        System.out.println(s.contains("World"));

        // 9. startsWith()
        System.out.println(s.startsWith("Hello"));

        // 10. endsWith()
        System.out.println(s.endsWith("Java"));

        // 11. equals()
        System.out.println(s.equals("Hello World Java"));

        // 12. equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase("hello world java"));

        // 13. toUpperCase()
        System.out.println(s.toUpperCase());

        // 14. toLowerCase()
        System.out.println(s.toLowerCase());

        // 15. replace()
        System.out.println(s.replace('o', 'x'));

        // 16. replaceAll()
        System.out.println(s.replaceAll(" ", "-"));

        // 17. trim()
        String text = "   hello world   ";
        System.out.println(text.trim());

        // 18. isEmpty()
        String empty = "";
        System.out.println(empty.isEmpty());

        // 19. isBlank()
        String blank = "   ";
        System.out.println(blank.isBlank());

        // 20. concat()
        System.out.println(s.concat(" Python"));

        // 21. join()
        System.out.println(String.join("-", "Hello", "World", "Java"));
    }
}

//                     String
//                       │
//        ┌──────────────┼──────────────┐
//        ↓              ↓              ↓
//     البحث          التعديل         التحويل
//        │              │              │
//    indexOf()       replace()      toUpperCase()
//    lastIndexOf()   replaceAll()    toLowerCase()
//    contains()                     toCharArray()
//    startsWith()                   split()
//    endsWith()

// وأهم 6 لك في حل الـ Problem Solving حاليًا:
// length()
// charAt()
// split()
// toCharArray()
// indexOf()
// substring()
// ثم:
// replace()
// contains()
// equals()
// toUpperCase()
// toLowerCase()