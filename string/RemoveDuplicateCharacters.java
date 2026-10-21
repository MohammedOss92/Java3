package string;


public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String text = "programming";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            boolean found = false;

            // البحث في الحروف السابقة
            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // إذا كان الحرف مكررًا، تجاهله
            if (found) {
                continue;
            }

            // إذا لم يكن مكررًا، أضفه
            result = result + text.charAt(i);
        }

        System.out.println(result);
    }
}
