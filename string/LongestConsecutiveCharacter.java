public class LongestConsecutiveCharacter{

    public static void main(String[] args) {

        String a = "aaassda";

        int currentCount = 1;
        int maxCount = 0;
        char maxChar = a.charAt(0);

        for (int i = 1; i < a.length(); i++) {

            if (a.charAt(i) == a.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = a.charAt(i);
            }
        }

        System.out.println("Character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}
