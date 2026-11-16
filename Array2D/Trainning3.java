
public class Trainning3 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[][] numbers = {
    {10, 21, 30},
    {41, 50, 61},
    {70, 81, 90}
};
        int rows=numbers.length;
        int cols=numbers[0].length;
          int countodd =0;
            int evenCount =0;
          
        
        for(int i=0;i<rows;i++){
            
            for(int j=0;j<cols;j++){
                if(numbers[i][j] % 2 == 0){
    evenCount++;
}else{
    countodd++;
}
            }
           // System.out.print("odd "+countodd);
          //  System.out.print("event "+evenCount);
        }
        System.out.print("odd "+countodd);
            System.out.print("event "+evenCount);
    }
    
}