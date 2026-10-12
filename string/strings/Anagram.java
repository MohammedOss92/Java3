package string.strings;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //أنشأنا String اسمها s1:
        String s1 = "listen";
        //أنشأنا String اسمها s2:
        String s2 = "silentss";

        //تحويل String إلى char array
        //a

//['l', 'i', 's', 't', 'e', 'n']
//لأننا نريد التعامل مع كل حرف لوحده.
           char[] a = s1.toCharArray(); 
           char[] b= s2.toCharArray();

           //الآن لدينا:

//a = l i s t e n

//b = s i l e n t
           Arrays.sort(a);
           Arrays.sort(b);
        if(s1.length()==s2.length()){
            if(Arrays.equals(a, b)){
System.out.println("Anagram");
            }
            else{
                System.out.println("nnAnagram");

            }
            
            
        }

        else {
    // ماذا نطبع هنا؟
    System.out.println("nnAnagram");
}

    }
    
}

// | المطلوب                | نستخدم                      |
// | ---------------------- | --------------------------- |
// | معرفة حرف في مكان معين | `charAt()` أو `char[]`      |
// | ترتيب الحروف           | `char[]` + `Arrays.sort()`  |
// | مقارنة الحروف          | `char[]`                    |
// | البحث عن تكرار حرف     | `char[]` أو `charAt()`      |
// | عكس الحروف             | يمكن `charAt()` أو `char[]` |
// | Anagram                | `char[]` مناسب جدًا         |



// هل الطول متساوٍ؟
//        ↓
//      نعم
//        ↓
// حوّل إلى char[]
//        ↓
// رتّب الحروف
//        ↓
// قارن
//        ↓
// متساوي؟ → Anagram
// غير متساوي؟ → Not Anagram

// أما إذا الطول مختلف
//        ↓
// مباشرة Not Anagram