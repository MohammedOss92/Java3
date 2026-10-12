public class ArrayDigit2 {

    public static void main(String args[]) {

        int[] numbers = {10, 25, 41, 7, 100, 32};

        int count = 0;
        //لاننا نريد طباعة العناصر خارج for
        int[] result = new int[numbers.length];
int count1 = 0;
        
        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];
            boolean found = false;

            while (number != 0) {

                int digit = number % 10;

                if (digit == 1) {
                   // System.out.println(1);
                    count1++;
                    found = true;
                }

                number = number / 10;
            }

            if (found) {
                result[count] = numbers[i];
                count++;
            }
        }

        // طباعة العناصر التي تحتوي على 1
        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
        
        for (int i = 0; i < count1; i++) {
    System.out.println(1);
}
    }
}