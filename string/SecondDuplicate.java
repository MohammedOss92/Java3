package string;

public class SecondDuplicate {
    public static void main(String[] args) {
        // String text = "programming";

        // int duplicateCount = 0;

        // for (int i = 0; i < text.length(); i++) {

        //     boolean duplicate = false;
        //      for (int j = i + 1; j < text.length(); j++) {

        //         if (text.charAt(i) == text.charAt(j)) {
        //             duplicate = true;
        //             break;
        //         }
        //     }

        //     if (duplicate) {
        //         duplicateCount++;

        //         if (duplicateCount == 2) {
        //             System.out.println(text.charAt(i));
        //             return;
        //         }
        //     }
        // }

// يجب أن نغير الخوارزمية لتبحث عن ثاني حرف يتكرر من حيث لحظة اكتشاف التكرار، وليس من حيث مكان أول ظهور.

String text1 = "programming";

        int duplicateCount1 = 0;

        for (int i = 0; i < text1.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (text1.charAt(i) == text1.charAt(j)) {

                    duplicateCount1++;

                    if (duplicateCount1 == 2) {
                        System.out.println(text1.charAt(i));
                        return;
                    }

                    break;
                }
            }
        }
    }
}


    