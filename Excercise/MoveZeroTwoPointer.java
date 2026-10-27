
public class MoveZeroTwoPointer {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {0, 3, 0, 5, 7};
        int left = 0;
        
        for (int i = 0; i < numbers.length; i++) {
    
            
            if (numbers[i] != 0) {
    // سنضع التبديل هنا
                int temp = numbers[left];
numbers[left] = numbers[i];
numbers[i] = temp;
                left++;
}

    // بقية الكود
}
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    
}