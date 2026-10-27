
public class MissingNumber {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] num={1,2,4,5,7};
        for(int i=0;i<num.length-1;i++){
            if(num[i+1]-num[i]>1){
                System.out.println(num[i] + 1);
      //  break;
            }
        }
        
        
    }
    
}