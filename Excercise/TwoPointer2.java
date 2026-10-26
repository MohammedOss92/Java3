
public class TwoPointer2 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {2, 4, 6, 8, 10};
int target =14;
boolean found = false;
int left = 0;
int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[right]+numbers[left];
            System.out.println(numbers[left] + " + " + numbers[right]
        + " = " + sum);
            if(sum==target){
                System.out.println(numbers[right]+ "+" + numbers[left] +"="+sum);
                found = true;
                break;
            }
            else if(sum < target){
                left++;
            }else{
                right--;
            }
           
        }
         if(!found){
                System.out.print("not");
            }
    }
    
}

/*.
 * مثل إيجاد العددين 4 و10 عندما يكون الهدف 14 في مصفوفة مرتبة.
3. التحقق من وجود عناصر مكررة متجاورة
تتعلم كيف تقارن العناصر المتجاورة باستخدام مؤشرين.
4. إزالة التكرارات من مصفوفة مرتبة
تستخدم مؤشرين للاحتفاظ بالقيم غير المكررة.
5. التحقق هل الكلمة متناظرة — Palindrome
مثل كلمة تُقرأ بالطريقة نفسها من اليمين واليسار.
6. إيجاد زوج مجموعه أقرب إلى هدف
مسألة أصعب قليلًا تعتمد على فهم حركة٠
 * */
 