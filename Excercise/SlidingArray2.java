
public class SlidingArray2 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {4, 2, 7, 1, 8, 3};
        int k=2;
        int winSum = numbers[0] + numbers[1];
        int maxSum = winSum;
        for(int i = k;i<numbers.length;i++){
               System.out.println(
                winSum + " - " + numbers[i - k] +
                " + " + numbers[i] + " = " +
                (winSum - numbers[i - k] + numbers[i])
            );
             winSum = winSum - numbers[i - k] + numbers[i];

               if (winSum > maxSum) {
                maxSum = winSum;
            }

            // نطبع رقم الدورة ومجموع النافذة وأكبر مجموع
            System.out.println(
                "i = " + i +
                " | windowSum = " + winSum +
                " | maxSum = " + maxSum
            );
            
        }
        
    }
    
}

/*قبل الحلقة:
k = 2
winSum = 4 + 2 = 6
maxSum = 6

الدورة الأولى:
i = 2
k = 2
i - k = 2 - 2 = 0
الخارج = numbers[0] = 4
الداخل = numbers[2] = 7
winSum = 6 - 4 + 7 = 9
maxSum = 9

الدورة الثانية:
i = 3
k = 2
i - k = 3 - 2 = 1
الخارج = numbers[1] = 2
الداخل = numbers[3] = 1
winSum = 9 - 2 + 1 = 8
maxSum = 9

الدورة الثالثة:
i = 4
k = 2
i - k = 4 - 2 = 2
الخارج = numbers[2] = 7
الداخل = numbers[4] = 8
winSum = 8 - 7 + 8 = 9
maxSum = 9

الدورة الرابعة:
i = 5
k = 2
i - k = 5 - 2 = 3
الخارج = numbers[3] = 1
الداخل = numbers[5] = 3
winSum = 9 - 1 + 3 = 11
maxSum = 11*/