package string;

public class SubstringLongest {
    
   
    public static void main(String[] args) {

        String text = "abcbde";

        int start = 0;
        int max = 0;

        for (int i = 0; i < text.length(); i++) {

            for (int j = start; j < i; j++) {

                if (text.charAt(j) == text.charAt(i)) {
                    start = j + 1;
                    break;
                }
            }

            int count = i - start + 1;

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
