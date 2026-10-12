package string;

public class FirstDuplicate {
    public static void main(String[] args) {
        String text = "programming";
        for(int i =0;i<text.length();i++){
            for(int j=i+1;j<text.length();j++){
                if (text.charAt(i) == text.charAt(j)) {
                    System.out.println(text.charAt(i));
                    return;
            }
        }
    }
}}

