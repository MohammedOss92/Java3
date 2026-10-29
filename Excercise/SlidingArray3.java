
public class SlidingArray3 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {2, 1, 5, 1, 3, 2};

        int k = 3;
        int winSum =0;
        for(int i=0;i<k;i++){
            winSum += numbers[i];
        }
       // int winSum = numbers[0] + numbers[1] + numbers[2];
        int maxSum = winSum ;
        for(int i = k;i<numbers.length;i++){
              System.out.println(
                winSum + " - " + numbers[i - k] +
                " + " + numbers[i] + " = " +
                (winSum - numbers[i - k] + numbers[i])
            );
            
            winSum = winSum - numbers[i-k] + numbers[i];
            if(winSum<maxSum){
                maxSum = winSum;
            }
             System.out.println(
                "i = " + i +
                " | windowSum = " + winSum +
                " | maxSum = " + maxSum
            );
        }
        
    }
    
}