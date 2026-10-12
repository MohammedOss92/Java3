package string.strings;


public class Reverseeveryword {
    public static void main(String[] args) {
        String s = "hello world java";
        String[] a = s.split(" ");
      //  ونريد عكس الكلمة الحالية، وليس الكلمات نفسها.
        for(String word : a){
             for(int i =word.length()-1;i >=0;i--){
                  System.out.print(word.charAt(i)  );
    }
        System.out.print(" "  );
    }
    




    for (int i = a.length - 1; i >= 0; i--) {

    String word = a[i];

    for (int j = word.length() - 1; j >= 0; j--) {
        System.out.print(word.charAt(j));
    }

    System.out.print(" ");
    }

    
    
}}
