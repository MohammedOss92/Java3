public class ArraySearch {

    public static void main(String[] args) {

        // 1. البحث عن رقم باستخدام ==
        int[] numbers = {10, 20, 30, 40};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                System.out.println("Number: " + numbers[i]);
            }
        }


        // 2. البحث عن حرف باستخدام ==
        char[] letters = {'b', 'a', 'c', 'd', 'a'};

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a') {
                System.out.println("Character: " + letters[i]);
            }
        }


        // 3. البحث عن نص كامل باستخدام equals()
        String[] words = {"apple", "banana", "orange", "cat"};

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("banana")) {
                System.out.println("Exact text: " + words[i]);
            }
        }


        // 4. البحث عن نص يحتوي على حرف باستخدام contains()
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("a")) {
                System.out.println("Contains a: " + words[i]);
            }
        }
    }
}