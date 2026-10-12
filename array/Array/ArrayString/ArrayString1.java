public class ArrayString1 {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "cat"};

        for (int i = 0; i < words.length; i++) {

            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            System.out.println("First: " + first);
            System.out.println("Last: " + last);
        }
    }
}