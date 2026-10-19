
public class ExcerLinearSearch {

    public static void main(String[] args) {

        int[] numbers = {12,18, 7, 25, 9, 18, 30, 14};
        int target = 20;
        int repeat =0;
        int count = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            count++;

            if (numbers[i] == target) {
                found = true;
                System.out.println("Found at index: " + i);
                repeat++;
               // break;
            }
        }

        if (found) {
            System.out.print(repeat);
            System.out.println("Number of comparisons: " + count);
        } else {
            System.out.println("Not found");
            System.out.println("Number of comparisons: " + count);
        }
    }
}
