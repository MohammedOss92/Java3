
public class Array2DMaxSumRow{

    public static void main(String args[]){

int[][] numbers = {
    {10, 20, 30},
    {50, 10, 5},
    {2, 4, 6}
};

int maxSum = 0;
int maxRow = 0;

for (int i = 0; i < numbers.length; i++) {

    int sum = 0;

    for (int j = 0; j < numbers[i].length; j++) {
        sum = sum + numbers[i][j];
    }

    if (sum > maxSum) {
        maxSum = sum;
        maxRow = i + 1;
    }
}

System.out.println("Row = " + maxRow);
System.out.println("Maximum Sum = " + maxSum);

    }
}

/*لماذا وضعنا:
int sum = 0;

sum نضعه داخل الحلقة الخارجية لأننا نريد تصفيره عند بداية كل صف، ثم نجمع عناصر ذلك الصف فقط.
داخل الحلقة الخارجية، بينما وضعنا:
int maxSum = 0;
خارج الحلقة الخارجية؟
نريد الاحتفاظ بأكبر مجموع وجدناه حتى الآن، لذلك نعرّف maxSum خارج الحلقة الخارجية حتى لا نفقد قيمته عند الانتقال إلى صف جديد.
أصبحت تفهم الآن الفرق بين المتغيرات حسب
أريد إجابتك بكلماتك. 😊*/