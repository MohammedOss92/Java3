
public class Array8{

    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 10};
        
        int left = 0;                  // المؤشر الأول (من البداية)
        int right = numbers.length - 1; // المؤشر الثاني (من النهاية)
        boolean isPalindrome = true;   // متغير لحفظ النتيجة

        while (left < right) {
            // مقارنة العنصرين في الطرفين
            if (numbers[left] != numbers[right]) {
                isPalindrome = false;
                break; // التوقف فوراً عند العثور على عدم تطابق
            }
            left++;  // تحريك المؤشر الأيسر للأمام
            right--; // تحريك المؤشر الأيمن للخلف
        }

        // طباعة النتيجة
        if (isPalindrome) {
            System.out.println("المصفوفة هي Palindrome");
        } else {
            System.out.println("المصفوفة ليست Palindrome");
        }






// boolean isPalindrome = true;
// int[] numbers = {10, 20, 30, 20, 10};

// // وضعنا مؤشرين داخل الـ for (left و right)
// for (int left = 0, right = numbers.length - 1; left < right; left++, right--) {
//     if (numbers[left] != numbers[right]) {
//         isPalindrome = false;
//         break;
//     }
// }

    }
}

// حلقة while تعتمد على الشرط فقط.

// أما حلقة for فتعتمد على (البداية + الشرط + طريقة التحديث)