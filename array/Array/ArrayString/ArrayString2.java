public class ArrayString2 {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "cat"};

        for (int i = 0; i < words.length; i++) {

            if (words[i].contains("a")) {
                System.out.println(words[i]);
            }
        }
    }
}