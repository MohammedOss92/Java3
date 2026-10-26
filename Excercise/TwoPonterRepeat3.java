
public class TwoPonterRepeat3 {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 5, 7};
        boolean found = false;

        for (int left = 0, right = 1;
             right < numbers.length;
             left++, right++) {

            if (numbers[left] == numbers[right]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Adjacent duplicate found");
        } else {
            System.out.println("No adjacent duplicates");
        }
    }
}
