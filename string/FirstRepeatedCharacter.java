
public class FirstRepeatedCharacter {
     public static void main(String[] args) {
        String text = "programming";
         int duplicateCount1=0;
        for(int i =0;i<text.length();i++){
            for(int j=i+1;j<text.length();j++){
                if (text.charAt(i) == text.charAt(j)) {
                    System.out.println(text.charAt(i));
                   return;
                }
                    duplicateCount1++;

                    if (duplicateCount1 == 2) {
                        System.out.println(text.charAt(i));
                        return;
                    }

                    break;
            }
        
     }
}}