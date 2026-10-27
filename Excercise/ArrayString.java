/*
التحدي الثاني (استخدام string, length, continue):
 * - لديك مصفوفة من الكلمات أو النصوص (String array).
 * - تريد المرور على الكلمات، لكن بشرط: إذا كانت طول الكلمة (length) أقل من 4 حروف، 
 *   تخلفها وتتجاوزها باستخدام (continue)، ولا تطبعها.
 * 
 * ------------------------------------------------------------------------------
 * 
 * التحدي الثالث (الدمج الذكي):
 * - لديك مصفوفة أرقام (int array) تحتوي على أرقام موجبة وسالبة.
 * - أوجد مجموع الأرقام الموجبة فقط، واستخدم (continue) لتخطي أي رقم سالب يواجهك في الطريق.
 * ==========================
*/
public class ArrayString {
    
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String [] words ={"abcd","aqsed","dfvbyo","yrewhj","hfsx"};
        for(int i=0;i<words.length;i++){
            if(words[i].length()<=4){
                continue;
            }
            else{
                System.out.println(words[i]);
            }
        }
    }
    
}