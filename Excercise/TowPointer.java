
public class TowPointer {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int tem = numbers[right];
            numbers[right]=numbers[left];
            numbers[left]=tem;
            left++;
            right--;
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ,");
            
        }
    }
    
}
/*إذا كان المجموع أصغر من الهدف، نحرّك left إلى اليمين لزيادة المجموع.
إذا كان المجموع أكبر من الهدف، نحرّك right إلى اليسار لتقليل المجموع.
إذا كان المجموع يساوي الهدف، فقد وجدنا الحل.*/