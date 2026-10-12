
public class SecondMostRepeatedCharacter {
  

    public static void main(String[] args) {

        String a = "aaabbbbcc";

        int maxCount = 0;
        int secondMaxCount = 0;

        char maxChar = '\0';
        char secondMaxChar = '\0';

        for (int i = 0; i < a.length(); i++) {

            int count = 0;

            // نحسب تكرار الحرف الحالي
            for (int j = 0; j < a.length(); j++) {

                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }

            // إذا كان الحرف مكررًا من قبل، نتجاهله
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // تحديث الأكثر والثاني الأكثر
            if (count > maxCount) {

                secondMaxCount = maxCount;
                secondMaxChar = maxChar;

                maxCount = count;
                maxChar = a.charAt(i);

            } else if (count > secondMaxCount) {

                secondMaxCount = count;
                secondMaxChar = a.charAt(i);
            }
        }

        System.out.println("Most repeated: " + maxChar + " = " + maxCount);
        System.out.println("Second most repeated: " + secondMaxChar + " = " + secondMaxCount);
    }
}  
