public class CountEachCharacter {
    public static void main(String[] args) {

        String t = "asdfgjkuytasd";

        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            // هل ظهر الحرف سابقًا؟
            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (c == t.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // إذا ظهر سابقًا، نتجاهله
            if (found) {
                continue;
            }

            // حساب عدد مرات ظهور الحرف
            int count = 0;

            for (int j = 0; j < t.length(); j++) {

                if (c == t.charAt(j)) {
                    count++;
                }
            }

            System.out.println(c + " = " + count);
        }
    }
}
