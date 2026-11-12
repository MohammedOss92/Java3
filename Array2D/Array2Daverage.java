
public class Array2Daverage{

    public static void main(String args[]){

int[][] numbers = {
    {10, 20, 30},
    {5, 15, 25},
    {2, 4, 6}
};
    for (int i = 0; i < numbers.length; i++) {
int max = numbers[i][0];
            // مجموع الصف الحالي
            int sum = 0;
            double avg = 0;
//int max = numbers[i][0];
            // المرور على أعمدة الصف
            for (int j = 0; j < numbers[i].length; j++) {

                // طباعة العنصر
                sum=sum+numbers[i][j];
           //     avg = (double) sum / numbers[i].length;
                }
              
              avg = (double) sum / numbers[i].length;   System.out.println("Sum of row " + (i + 1) + " = " + sum);
                 
                 System.out.println("avg of row " + (i + 1) + " = " + avg);
                 
                }

    }
}
