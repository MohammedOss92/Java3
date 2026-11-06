
public class ArraySlidingwhile{

    public static void main(String args[]){

        int[] numbers = {2, 1, 5, 1, 3, 2};

        int k = 3;
        int winSum =0;
        int i=0;
        while (i<k){
           winSum += numbers[i];
           i++; 
        }
        int j = k;
        int maxSum = winSum ;
        while (j<numbers.length){
            winSum = winSum - numbers[j-k] + numbers[j];
            if(winSum>maxSum){
                maxSum = winSum;
            }
             System.out.println(
                "j = " + j +
                " | windowSum = " + winSum +
                " | maxSum = " + maxSum
            );
            
            j++;
        }
    }
}
