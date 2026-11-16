
public class tranning {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
          int[][] numbers = {
            {10, 20, 90},
            {1, 2, 3},
            {4, 5, 6}
        };

        // معرفة عدد الصفوف
        int rows = numbers.length;

        // معرفة عدد الأعمدة
        int cols = numbers[0].length;
      System.out.println(rows);
      System.out.println(cols);
      
      for (int i = 0; i < rows; i++) {

    for (int j = 0; j < numbers[i].length; j++) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
}
      System.out.println("&&&&&");
      
      for (int j = 0; j < numbers[0].length; j++) {

    for (int i = 0; i < numbers.length; i++) {

        System.out.print(numbers[i][j] + " ");
    }

    System.out.println("&&&&&&&");
}

      System.out.println("&&&&&&");
        for(int i=0;i<rows;i++){
            int max = numbers[i][0];
            int min = numbers[i][0];
            int sum = 0;
              for (int j = 0; j < cols; j++) {

                // البحث عن أكبر عنصر
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }

                // البحث عن أصغر عنصر
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }

                // جمع عناصر الصف
                sum += numbers[i][j];
            }

            // طباعة أكبر عنصر في الصف
            System.out.println("Row " + (i + 1) + " Max = " + max);

            // طباعة أصغر عنصر في الصف
           System.out.println("Row " + (i + 1) + " Min = " + min);

            // طباعة مجموع الصف
            System.out.println("Row " + (i + 1) + " Sum = " + sum); 

            System.out.println();
        }
      
      for(int i=0;i<cols;i++){
        int min = numbers[0][i];
        int max = numbers[0][i];
        int sum = 0;
        
        for(int j=0;j<rows;j++){
          if(numbers[j][i]>max){
            max = numbers[j][i];
          }
           if(numbers[j][i]<max){
            min = numbers[j][i];
          }
          sum += numbers[j][i];
        }
          System.out.println("Colsss " + (i + 1) + " Max = " + max);

            // طباعة أصغر عنصر في الصف
           System.out.println("Colssss " + (i + 1) + " Min = " + min);
        System.out.println("Sum col " + (i + 1) + " Sum = " + sum);

      }

      for (int i = 0; i < cols; i++) {

    int sum = 0;

    System.out.print("Column " + (i + 1) + ": ");

    for (int j = 0; j < rows; j++) {

        System.out.print(numbers[j][i]);

        sum += numbers[j][i];

        if (j < rows - 1) {
            System.out.print(" + ");
        }
    }

    System.out.println(" = " + sum);
}
      
      System.out.println("&&&&&");
      int max = numbers[0][0];
int min = numbers[0][0];

for (int i = 0; i < rows; i++) {

    for (int j = 0; j < cols; j++) {

        if (numbers[i][j] > max) {
            max = numbers[i][j];
        }

        if (numbers[i][j] < min) {
            min = numbers[i][j];
        }
    }
}

System.out.println("Max = " + max);
System.out.println("Min = " + min);
      System.out.println("___________");
      int maxSum = Integer.MIN_VALUE;
int minSum = Integer.MAX_VALUE;

int maxRow = 0;
int minRow = 0;

for (int i = 0; i < rows; i++) {

    int sum = 0;

    System.out.print("Row " + (i + 1) + ": ");

    // المرور على عناصر الصف
    for (int j = 0; j < cols; j++) {

        System.out.print(numbers[i][j]);

        sum += numbers[i][j];

        if (j < cols - 1) {
            System.out.print(" + ");
        }
    }

    System.out.println(" = " + sum);

    // أكبر مجموع صف
    if (sum > maxSum) {
        maxSum = sum;
        maxRow = i + 1;
    }

    // أصغر مجموع صف
    if (sum < minSum) {
        minSum = sum;
        minRow = i + 1;
    }
}

// طباعة النتائج
System.out.println("Largest Row Sum = " + maxSum);
System.out.println("Row Number = " + maxRow);

System.out.println("Smallest Row Sum = " + minSum);
System.out.println("Row Number = " + minRow);
      
      
      System.out.println("---------");
      
      
      
      int maxSum2 = Integer.MIN_VALUE;
int minSum2 = Integer.MAX_VALUE;

int maxColumn = 0;
int minColumn = 0;

for (int i = 0; i < cols; i++) {

    int sum = 0;

    System.out.print("Column " + (i + 1) + ": ");

    // المرور على عناصر العمود
    for (int j = 0; j < rows; j++) {

        // طباعة العنصر
        System.out.print(numbers[j][i]);

        // جمع عناصر العمود
        sum += numbers[j][i];

        // طباعة علامة + بين العناصر
        if (j < rows - 1) {
            System.out.print(" + ");
        }
    }

    // طباعة مجموع العمود
    System.out.println(" = " + sum);

    // البحث عن أكبر مجموع عمود
    if (sum > maxSum2) {
        maxSum2 = sum;
        maxColumn = i + 1;
    }

    // البحث عن أصغر مجموع عمود
    if (sum < minSum2) {
        minSum2 = sum;
        minColumn = i + 1;
    }
}

// طباعة النتائج النهائية
System.out.println("Largest Column Sum = " + maxSum);
System.out.println("Column Number = " + maxColumn);

System.out.println("Smallest Column Sum = " + minSum);
System.out.println("Column Number = " + minColumn);
            
        }

    }
    
